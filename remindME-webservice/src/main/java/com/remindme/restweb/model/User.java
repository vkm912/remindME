package com.remindme.restweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
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
	@ElementCollection
	@JoinTable(name = "USER_EMAIL_DETAILS",
	           joinColumns = @JoinColumn(name = "USER_ID"))
	@Column(name = "EMAIL_ADDRESS")
	private Set<String> emailIds = new HashSet();
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "START_TIME")
	private Date startTime;
	@Column(name = "ITERATION")
	private double iteration;

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

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStatTime(Date startTime) {
		this.startTime = startTime;
	}

	public double getIteration() {
		return iteration;
	}

	public void setIteration(double iteration) {
		this.iteration = iteration;
	}
}
