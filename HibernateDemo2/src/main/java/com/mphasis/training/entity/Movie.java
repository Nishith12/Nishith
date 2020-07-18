package com.mphasis.training.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	private int movieId;
	@OneToMany
	private Theater theater=new Theater();
	@OneToMany
	private Booking booking=new Booking();
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
}
