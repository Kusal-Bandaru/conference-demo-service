package com.kusal.conferencedemo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="speakers")
public class Speaker {

	@Id
	@Column(name="speaker_id")
	long id;
	
	@Column(name="speaker_first_name")
	String firstName;
	
	@Column(name="speaker_last_name")
	String lastName;
	
	@Column(name="speaker_title")
	String title;
	
	@Column(name="speaker_bio")
	String bio;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "sessionSpeakers")
	List<Session> speakerSessions;

	/**
	 * default constructor
	 */
	public Speaker() {
	}

	/**
	 * @return the speakerSessions
	 */
	public List<Session> getSpeakerSessions() {
		return speakerSessions;
	}

	/**
	 * @param speakerSessions the speakerSessions to set
	 */
	public void setSpeakerSessions(List<Session> speakerSessions) {
		this.speakerSessions = speakerSessions;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
}
