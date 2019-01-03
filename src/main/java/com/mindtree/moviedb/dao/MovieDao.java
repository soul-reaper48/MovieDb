package com.mindtree.moviedb.dao;

import java.util.List;

import com.mindtree.moviedb.exception.dao.MovieDaoException;
import com.mindtree.moviedb.model.Actor;
import com.mindtree.moviedb.model.Genre;
import com.mindtree.moviedb.model.Movie;

public interface MovieDao {

	void addActor(Actor actor) throws MovieDaoException;
	void addMovie(Movie movie) throws MovieDaoException;
	List<Movie> getAll() throws MovieDaoException;
	Movie updateBoxOffice(Movie movie) throws MovieDaoException;
	void addGenre(Genre genre) throws MovieDaoException;
}
