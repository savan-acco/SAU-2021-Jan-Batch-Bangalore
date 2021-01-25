package com.hibernate2.hibernateproj.repository;




import org.springframework.data.repository.CrudRepository;
import com.hibernate2.hibernateproj.entity.Movie;

import java.util.List;

public interface MovieJPARepository extends CrudRepository<Movie, Integer> {

	//get by name
    public List<Movie> findMovieByName(String name);

    
    // get by release year
    
    public Movie findMovieByReleaseYear(int year);

    
    
    
    // get by Director name
    public List<Movie> findMoviesByDirectorNameOrderByName(String name);


}