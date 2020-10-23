package com.cts.service;

import java.util.Date;
import java.util.List;

import com.cts.model.Movie;

public interface Movieservice {
	
	List<Movie> getAllMovies();
	public Movie getMovieById(int id);
	public Movie getMovieByName(String name);
	public List<Movie> getMovieByLanguage(String language);
	public List<Movie> getMovieByBudget(Long startBudget,Long endBudget);
	public List<Movie> getMovieByReleaseDate(Date startDate,Date endDate);
	public List<Movie> gettopFiveMovies();

}
