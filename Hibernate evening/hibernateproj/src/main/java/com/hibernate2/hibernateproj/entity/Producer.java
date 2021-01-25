package com.hibernate2.hibernateproj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity  
public class Producer {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private Integer producer_id;

	private String producer;
	
	
	
	@OneToOne  
    private Movie movie;  
	
	
	
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Integer getProducer_id() {
		return producer_id;
	}

	public void setProducer_id(Integer i) {
		this.producer_id = i;
	}

	
	
	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	

}
