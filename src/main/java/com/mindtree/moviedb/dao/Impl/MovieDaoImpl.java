package com.mindtree.moviedb.dao.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mindtree.moviedb.dao.MovieDao;
import com.mindtree.moviedb.exception.dao.MovieDaoException;
import com.mindtree.moviedb.model.Actor;
import com.mindtree.moviedb.model.Genre;
import com.mindtree.moviedb.model.Movie;

public class MovieDaoImpl implements MovieDao {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
	}
	
	//Adding Actor details to database
	@Transactional
	public void addActor(Actor actor) throws MovieDaoException {
		try {
			hibernateTemplate.save(actor);
		} catch (DataAccessException e) {
			throw new MovieDaoException(e.getLocalizedMessage(),e);
		}
	}

	//Updating the Box Office Details
	@Transactional
	public Movie updateBoxOffice(Movie movie) throws MovieDaoException {
		try {
			hibernateTemplate.update(movie);
			return movie;
		} catch (DataAccessException e) {
			throw new MovieDaoException(e.getLocalizedMessage(),e);
		}
	}

	//Adding Movie details to database
	@Transactional
	public void addMovie(Movie movie) throws MovieDaoException {
		try {
			System.out.println(""+movie);
			hibernateTemplate.save(movie);
		} catch (DataAccessException e) {
			throw new MovieDaoException(e.getLocalizedMessage(),e);
		}
	}

	//Get the list of movies from database
	@Override
	public List<Movie> getAll() throws MovieDaoException {
		try {
			List<Movie> list = hibernateTemplate.loadAll(Movie.class);
			return list;
		} catch (DataAccessException e) {
			throw new MovieDaoException(e.getLocalizedMessage(),e);
		}
	}

	//Adding genre details to database
	@Transactional
	@Override
	public void addGenre(Genre genre) throws MovieDaoException {
		 try {
			hibernateTemplate.save(genre);
		} catch (DataAccessException e) {
			throw new MovieDaoException(e.getLocalizedMessage(),e);
		}
	}

}
