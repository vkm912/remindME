package com.remindme.restweb.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@NamedQueries({
	@NamedQuery(name="User.findByEmailId", query = "from User where primaryEmailId = ?"),
	@NamedQuery(name="User.removeByEmailId", query = "delete from User where primaryEmailId = ?")
})
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL_ID")
	private String primaryEmailId;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "USER_EMAIL_DETAILS",
	           joinColumns = @JoinColumn(name = "USER_ID"))
	@Column(name = "EMAIL_ADDRESS")
	private Set<String> emailIds = new HashSet<>();

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<String> getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
