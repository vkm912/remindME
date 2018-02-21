package com.remindme.restweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_EMAIL_DTL")
public class UserEmailDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*@Column(name="USER_ID")
	private int userId;*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RECORD_ID")
	private int id;
	@ManyToOne
	@JoinColumn(name ="ID", insertable=false, updatable=false)
	private User user;
	@Column(name="EMAIL_ADDRESS")
	private String emailId;
	
	public User getUser() {
		return user;
	}
	public void User(User user) {
		this.user = user;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
