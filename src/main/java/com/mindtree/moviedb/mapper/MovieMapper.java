package com.mindtree.moviedb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindtree.moviedb.model.Actor;
import com.mindtree.moviedb.model.Genre;
import com.mindtree.moviedb.model.Movie;

public class MovieMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		Movie movie = new Movie();
		movie.setMovieId(rs.getInt("movieId"));
		movie.setName(rs.getString("name"));
		movie.setGenre((Genre) rs.getObject("genre"));
		movie.setActor(rs.getInt("actor"));
		movie.setType(rs.getString("type"));
		movie.setBoxOffice(rs.getDouble("boxOffice"));
		return movie;
	}

}
