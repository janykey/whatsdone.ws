package com.example.models;

import java.util.Date;

//@Entity
public class Todo {

	// @Id
	// @GeneratedValue
	private Integer id;

	private final Date created;
	private Date due;

	private String topic;
	private String description;

	public Todo() {
		this.created = new Date();
	}

	public Todo(final Date due, final String topic, final String description) {
		super();
		this.created = new Date();
		this.due = due;
		this.topic = topic;
		this.description = description;
	}

	public Date getDue() {
		return due;
	}

	public void setDue(final Date due) {
		this.due = due;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(final String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

}
