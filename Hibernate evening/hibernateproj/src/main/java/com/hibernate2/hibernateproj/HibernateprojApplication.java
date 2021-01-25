package com.hibernate2.hibernateproj;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.hibernate2.hibernateproj.entity.Actor;
import com.hibernate2.hibernateproj.entity.Movie;
import com.hibernate2.hibernateproj.entity.Producer;
import com.hibernate2.hibernateproj.repository.ActorJPARepository;
import com.hibernate2.hibernateproj.repository.MovieJPARepository;
import com.hibernate2.hibernateproj.repository.MovieRepository;
import com.hibernate2.hibernateproj.repository.ProducerJPARepository;


@Component
@SpringBootApplication
@Transactional
public class HibernateprojApplication implements CommandLineRunner {

	@Resource
    MovieRepository movieRepository;

    @Autowired
    MovieJPARepository movieJPARepository;
    @Autowired
    ProducerJPARepository producerJPARepository;
	
    @Autowired
    ActorJPARepository actorJPARepository;
    
	public static void main(String[] args) {
		SpringApplication.run(HibernateprojApplication.class, args);
		

	}
	
	public void run(String... args) throws Exception {
		
		
	// uncomment these and run the application
		
	// made new model of Actor and Producer and made relations with Movie	
		
		
		
//	  Movie movie = new Movie();
//      movie.setName("Fire");
//      movie.setDirectorName("Anne");
//      movie.setLang("jp");
//      movie.setImdbRating(4.8);
//      movie.setReleaseYear(2014);
//		
//      movieJPARepository.save(movie);
		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pers_unit");  
//        
//        EntityManager em=emf.createEntityManager();
//        
//        em.getTransaction().begin();  
        
        //Producer obj=new Producer();  
        //obj.setProducer_id("11");  
        //obj.setProducer("XYZ");  
        
//      Movie obj=new Movie();
//      obj.setName("isdsdsc");
//      obj.setDirectorName("dosh");
//      obj.setLang("idt");
//      obj.setImdbRating(4.4);
//      obj.setReleaseYear(2015);
//     
//      movieRepository.addMovie(obj);
		
		
		
		
		
//		 Producer obj=new Producer();
//	      obj.setProducer("sarthak");
//	      producerJPARepository.save(obj);
	      
		
	      Actor obj=new Actor();
	      obj.setName("akshay");
	      obj.setAge(24);
	      obj.setGender("Male");
	      actorJPARepository.save(obj);
		 
        
        //em.persist(obj);  
//        em.getTransaction().commit();  
//        em.close();  
//        emf.close();
      

		
		// TODO Auto-generated method stub
		
	}

}
