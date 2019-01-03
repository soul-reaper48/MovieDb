package com.mindtree.moviedb.service.Impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.moviedb.dao.MovieDao;
import com.mindtree.moviedb.dao.Impl.MovieDaoImpl;
import com.mindtree.moviedb.exception.dao.MovieDaoException;
import com.mindtree.moviedb.exception.service.MovieServiceExceptions;
import com.mindtree.moviedb.model.Actor;
import com.mindtree.moviedb.model.Genre;
import com.mindtree.moviedb.model.Movie;
import com.mindtree.moviedb.service.MovieService;

public class MovieServiceImpl implements MovieService {

	ApplicationContext context = new ClassPathXmlApplicationContext("application-Context.xml");
	MovieDao movieDao = (MovieDaoImpl) context.getBean("springHibernateTemplateExample");

	public void addActor(Actor actor) throws MovieServiceExceptions {
		try {
			movieDao.addActor(actor);
		} catch (MovieDaoException e) {
			throw new MovieServiceExceptions(e.getLocalizedMessage(),e);
		}
	}

	public Movie updateBoxOffice(Movie movie) throws MovieServiceExceptions {
		try {
			return movieDao.updateBoxOffice(movie);
		} catch (MovieDaoException e) {
			throw new MovieServiceExceptions(e.getLocalizedMessage(),e);
		}
	}

	public void addMovie(Movie movie) throws MovieServiceExceptions {
		 try {
			movieDao.addMovie(movie);
		} catch (MovieDaoException e) {
			throw new MovieServiceExceptions(e.getLocalizedMessage(),e);
		}
	}

	@Override
	public void addGenre(Genre genre) throws MovieServiceExceptions {
		 try {
			movieDao.addGenre(genre);
		} catch (MovieDaoException e) {
			throw new MovieServiceExceptions(e.getLocalizedMessage(),e);
		}
	}

	@Override
	public List<Movie> getAll() throws MovieServiceExceptions {
		try {
			return movieDao.getAll();
		} catch (MovieDaoException e) {
			throw new MovieServiceExceptions(e.getLocalizedMessage(),e);
		}
	}

}


