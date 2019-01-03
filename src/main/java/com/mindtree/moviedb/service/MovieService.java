package com.mindtree.moviedb.service;

import java.util.List;

import com.mindtree.moviedb.exception.service.MovieServiceExceptions;
import com.mindtree.moviedb.model.Actor;
import com.mindtree.moviedb.model.Genre;
import com.mindtree.moviedb.model.Movie;

public interface MovieService {

	void addActor(Actor actor) throws MovieServiceExceptions;
	void addMovie(Movie movie) throws MovieServiceExceptions;
	List<Movie> getAll() throws MovieServiceExceptions;
	Movie updateBoxOffice(Movie movie) throws MovieServiceExceptions;
	void addGenre(Genre genre) throws MovieServiceExceptions;
}
