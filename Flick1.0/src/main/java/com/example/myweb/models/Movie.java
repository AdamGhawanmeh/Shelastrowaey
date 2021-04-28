package com.example.myweb.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="Movie")
@Table(name="Movies")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id  ;
	@Column
	private int Movie_id;
	@Column
	private int Duration;
	
	
	public Movie() {}
	
	public Movie(int Movie_id , int Duration) {
		
		
		this.Duration = Duration;
		this.Movie_id = Movie_id;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", Movie_id=" + Movie_id + ", Duration=" + Duration + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int Duration) {
		this.Duration = Duration;
	}
	public int getMovie_id() {
		return Movie_id;
	}
	public void setMovie_id(int Movie_id) {
		this.Movie_id= Movie_id;
	}
	
	
	
}
