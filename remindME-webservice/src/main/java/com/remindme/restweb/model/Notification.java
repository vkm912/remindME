package com.remindme.restweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.remindme.restweb.support.NotificationStatus;

@Entity
@Table(name = "NOTIFICATIONS")
public class Notification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	/*
	 * @Column(name="USER_ID") private int userId;
	 */
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	/*@JoinTable(name = "USER_NOTIFICATION_MAP", 
	           joinColumns = @JoinColumn(name = "NOTIFICATION_ID"), 
	           inverseJoinColumns = @JoinColumn(name = "USER_ID"))*/
	private User user;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Lob
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "START_TIME")
	private Date startTime;
	@Column(name = "ITERATION")
	private double iteration;
	@Column(name = "STATUS")
	private NotificationStatus status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public double getIteration() {
		return iteration;
	}

	public void setIteration(double iteration) {
		this.iteration = iteration;
	}

	public NotificationStatus getStatus() {
		return status;
	}

	public void setStatus(NotificationStatus status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
