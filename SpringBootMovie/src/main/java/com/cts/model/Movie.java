package com.cts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
    private Integer movieid;
	
	@Column(name = "movieName")
    private String movieName;
	
	@Column(name = "language")
    private String language;
	
	@Column(name = "budget")
    private long budget;
	
	@Column(name = "releaseDate")
    private Date releaseDate;
    
 public Movie() {
        
    }
    
    public Movie(Integer movieid,String movieName,String language, long budget, Date releaseDate) {
        this.movieid = movieid;
        this.movieName = movieName;
        this.language = language;
        this.budget = budget;
        this.releaseDate = releaseDate;
    }

	
	

	public Integer getMovieid() {
		return movieid;
	}

	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}
    
   