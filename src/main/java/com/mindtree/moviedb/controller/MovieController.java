package com.mindtree.moviedb.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.moviedb.exception.service.MovieServiceExceptions;
import com.mindtree.moviedb.model.Actor;
import com.mindtree.moviedb.model.Genre;
import com.mindtree.moviedb.model.Movie;
import com.mindtree.moviedb.service.MovieService;
import com.mindtree.moviedb.service.Impl.MovieServiceImpl;

@Controller
public class MovieController {

	private MovieService movieService = new MovieServiceImpl();

	@RequestMapping("/")
	public ModelAndView firstPage() {
		System.out.println("In firstPage");
		String msg = "Movie Db";
		return new ModelAndView("index","message",msg);
	}

	@RequestMapping("/index")
	public ModelAndView BackToIndex() {
		System.out.println("In Index");
		String msg = "Movie Db";
		return new ModelAndView("index","message",msg);
	}

	@RequestMapping(value="/addGenre")
	public ModelAndView addGenre() {
		//String msg = "Welcome";
		System.out.println("Adding genre");
		return new ModelAndView("addGenre");
	}

	@RequestMapping(value="/actionAddGenre",method=RequestMethod.POST)
	public ModelAndView addGenreToDb(@Validated Genre genre,Model model) {

		try {
			movieService.addGenre(genre);
		} catch (MovieServiceExceptions e) {
			System.out.println(e.getLocalizedMessage()+"\t"+e.getCause());
		}
		return new ModelAndView("actionCommon","message","Added Successfully");
	}

	@RequestMapping("/addActor")
	public ModelAndView addActor() {
		return new ModelAndView("addActor");
	}

	@RequestMapping(value="/actionAddActor",method=RequestMethod.POST)
	public ModelAndView addActorToDb(@Validated Actor actor,Model model) {

		try {
			if(actor.getAge() > 14) {
				movieService.addActor(actor);
				return new ModelAndView("actionCommon","message","Added Successfully");
			}
			else
				return new ModelAndView("actionCommon","message","Too young to be an Actor. Sorry!");
		} catch (MovieServiceExceptions e) {
			System.out.println(e.getLocalizedMessage()+"\t"+e.getCause());
		}
		return new ModelAndView("actionCommon","message","Couldn't add details");
	}

	@RequestMapping("/addMovie")
	public ModelAndView addMovie() {
		//String msg = "Welcome";
		return new ModelAndView("addMovie");
	}

	@RequestMapping(value="/actionAddMovie",method=RequestMethod.POST)
	public ModelAndView addMovieToDb(@Validated Movie movie,Model model,HttpServletRequest request) {

		Genre genre = new Genre();
		genre.setGenreId(Integer.parseInt(request.getParameter("genre_genreId")));
		movie.setGenre(genre);
		try {
			movieService.addMovie(movie);
			return new ModelAndView("actionCommon","message","Added Successfully");
		} catch (MovieServiceExceptions e) {
			System.out.println(e.getLocalizedMessage()+"\t"+e.getCause());
		}
		return new ModelAndView("actionCommon","message","Sorry, couldn't perform the operation");
	}

	@RequestMapping(value="showMovieByGenre")
	public ModelAndView getByGenre() {
		return new ModelAndView("getMovie");
	}

	@RequestMapping(value="/actionGetMovieByGenre", method=RequestMethod.POST)
	public ModelAndView getMovieByGenre(HttpServletRequest request) {
		Genre genre = new Genre();
		genre.setGenreId(Integer.parseInt(request.getParameter("genre_genreId")));
		int genreId = genre.getGenreId();
		ModelAndView modView = new ModelAndView();
		List<Movie> getAll = new ArrayList<>();
		try {
			getAll = movieService.getAll().stream().filter(m -> m.getGenre().getGenreId() == genreId ).collect(Collectors.toList());
		} catch (MovieServiceExceptions e) {
			System.out.println(e.getLocalizedMessage()+"\t"+e.getCause());
		}

		modView.setViewName("showMovies");
		modView.addObject("mov",getAll);
		return modView;
	}

	@RequestMapping(value="showTopGross")
	public ModelAndView getMovies(){

		ModelAndView modView = new ModelAndView();
		List<Movie> getAll = new ArrayList<>();
		try {
			getAll = movieService.getAll();
		} catch (MovieServiceExceptions e) {
			System.out.println(e.getLocalizedMessage()+"\t"+e.getCause());
		}
		Collections.sort(getAll,new GrossSort());
		getAll.forEach(System.out::println);

		modView.setViewName("showMovies");
		modView.addObject("mov",getAll);
		return modView;
	}

	@RequestMapping(value="getEmpById")
	public ModelAndView getById() {
		return new ModelAndView("getEmp");
	}

	@RequestMapping("/updateMovie")
	public ModelAndView updateEmp() {
		String msg = "Welcome";
		return new ModelAndView("updateMovie","message",msg);
	}

	@RequestMapping(value="/actionUpdate",method=RequestMethod.POST)
	public ModelAndView UpdateEmpInDb(@Validated Movie movie,Model model,HttpServletRequest request) {

		Genre genre = new Genre();
		genre.setGenreId(Integer.parseInt(request.getParameter("genre_genreId")));
		movie.setGenre(genre);
		try {
			movieService.updateBoxOffice(movie);
		} catch (MovieServiceExceptions e) {
			System.out.println(e.getLocalizedMessage()+"\t"+e.getCause());
		}
		return new ModelAndView("actionCommon","message","Updated Box Office");
	}


}

class GrossSort implements Comparator<Movie>{

	@Override
	public int compare(Movie gross1, Movie gross2) {

		if(gross1.getBoxOffice() == gross2.getBoxOffice())
			return 0;
		else if(gross1.getBoxOffice() > gross2.getBoxOffice())
			return -1;
		else
			return 1;
	}

}
