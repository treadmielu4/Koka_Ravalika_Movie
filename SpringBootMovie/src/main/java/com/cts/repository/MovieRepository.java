package com.cts.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Movie;


public interface MovieRepository  extends CrudRepository<Movie, Integer> {
	
	public Optional<Movie> findByMovieName(String name);
	
	public List<Movie> findByLanguage(String language);
	 
	public List<Movie> findByBudgetBetween(Long startBudget,Long endBudget);
	
	public List<Movie> findByReleaseDateBetween(Date startDate,Date endDate);
	
	@Query(nativeQuery = true, value = "select * from movie order by budget desc limit 5;")
	public List<Movie> findTopFiveMovies();

}
