package com.mindtree.moviedb.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int actorId;
	private String name;
	private int age;
	private String gender;
	

	public Actor() {}

	public Actor(int actorId, String name, int age, String gender) {
		super();
		this.actorId = actorId;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
		
}
