package com.hibernate2.hibernateproj.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hibernate2.hibernateproj.entity.Actor;
import com.hibernate2.hibernateproj.entity.Movie;


public interface ActorJPARepository extends CrudRepository<Actor, Integer>{

	// finding by name
	
	public List<Actor> findActorByName(String name);

	// finding by age
	public List<Actor> findActorByAge(int age);

	

	// finding by gender
	public List<Actor> findActorByGender(String gender);
    
    
	
}
