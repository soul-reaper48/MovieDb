package com.mindtree.moviedb.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int movieId;
	private String name;
	@ManyToOne
	private Genre genre;
	private int actor;
	private String type;
	private double boxOffice;
	
	public Movie() {}
	public Movie(int movieId, String name, Genre genre, int actor, String type, double boxOffice) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.genre = genre;
		this.actor = actor;
		this.type = type;
		this.boxOffice = boxOffice;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public int getActor() {
		return actor;
	}
	public void setActor(int actor) {
		this.actor = actor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", genre=" + genre + ", actor=" + actor + ", type="
				+ type + ", boxOffice=" + boxOffice + "]";
	}
	
}
