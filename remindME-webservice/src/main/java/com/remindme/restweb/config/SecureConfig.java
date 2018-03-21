package com.remindme.restweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecureConfig extends WebSecurityConfigurerAdapter{
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("vkm3").password("{noop}123").roles("USER").and()
		.withUser("vivek").password("{noop}123").roles("USER","ADMIN");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/Hello").hasRole("ADMIN")
		.and().csrf().disable().headers().frameOptions().disable();
	}
}
