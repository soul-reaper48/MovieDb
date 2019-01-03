package com.mindtree.moviedb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindtree.moviedb.model.Actor;

public class ActorMapper implements RowMapper<Actor> {

	@Override
	public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Actor actor = new Actor();
		actor.setActorId(rs.getInt("actorId"));
		actor.setName(rs.getString("name"));
		actor.setAge(rs.getInt("age"));
		actor.setGender(rs.getString("gender"));
		return actor;
	}

}
