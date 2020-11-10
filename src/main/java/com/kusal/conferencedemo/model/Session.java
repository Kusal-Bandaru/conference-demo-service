package com.kusal.conferencedemo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="sessions")
public class Session {
	
	@Id
	@Column(name="session_id")
	long id;
	
	@Column(name="session_name")
	String name;
	
	@Column(name="session_description")
	String description;
	
	@Column(name="session_length")
	int length;
	
	@Column(name="session_type")
	String type;
	
	@ManyToMany
	@JoinTable(
		name="session_speaker",
		joinColumns = @JoinColumn(name="session_id"),
		inverseJoinColumns = @JoinColumn(name="speaker_id"))	
	List<Speaker> sessionSpeakers;

	/**
	 * default constructor
	 */
	public Session() {
	}

	/**
	 * @return the sessionSpeakers
	 */
	public List<Speaker> getSessionSpeakers() {
		return sessionSpeakers;
	}

	/**
	 * @param sessionSpeakers the sessionSpeakers to set
	 */
	public void setSessionSpeakers(List<Speaker> sessionSpeakers) {
		this.sessionSpeakers = sessionSpeakers;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
