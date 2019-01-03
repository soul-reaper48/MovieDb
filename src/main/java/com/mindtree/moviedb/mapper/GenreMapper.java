package com.mindtree.moviedb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindtree.moviedb.model.Genre;

public class GenreMapper implements RowMapper<Genre> {

	@Override
	public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Genre genre = new Genre();
		genre.setGenreId(rs.getInt("genreId"));
		genre.setName(rs.getString("name"));
		return genre;
	}

}
