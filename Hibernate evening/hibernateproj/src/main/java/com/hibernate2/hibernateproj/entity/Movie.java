package com.hibernate2.hibernateproj.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "movie")
@Data
public class Movie {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String directorName;

    @Column
    private Double imdbRating;

    @Column
    private Integer releaseYear;

	@Column
    private String lang;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Producer producer;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Actor actor;
	

	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name=string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(Double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getName() {
		return name;
	}

    

}