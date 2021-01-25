package com.hibernate2.hibernateproj.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import com.hibernate2.hibernateproj.entity.Movie;
import com.hibernate2.hibernateproj.entity.Producer;





public interface ProducerJPARepository extends CrudRepository<Producer, Integer>
{

	
	public List<Movie> findProducerByProducer(String name);

    // select * from producer where name = :name

}
