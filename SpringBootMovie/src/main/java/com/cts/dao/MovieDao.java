package com.cts.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cts.model.Movie;

public interface MovieDao {
	
	List<Movie> getAllMovies();
	Movie getMovieById(int id);
	Movie getMovieByName(String name);
	List<Movie> getMovieByLang(String lang);
	List<Movie> getMovieByBudget(Long startBudget,Long endBudget);
    List<Movie> getMovieByReleaseDate(Date startDate,Date endDate);
    List<Movie> findTopFiveMovies();
    
	

}
