package com.cts.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.model.Movie;
import com.cts.repository.MovieRepository;

@Repository(value = "movieDao")
public class MovieDaoImpl implements MovieDao {

	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>) movieRepository.findAll();
	}
	@Override
	public Movie getMovieById(int id) {
		return movieRepository.findById(id).get();
	}
    @Override
    public Movie getMovieByName(String name){
		Optional<Movie> m = movieRepository.findByMovieName(name);
		if(m.isPresent()){
			return m.get();
		}
		return null;
	}
	@Override
	public List<Movie> getMovieByLang(String language) {
		List<Movie> moviels= movieRepository.findByLanguage(language);
		if(moviels!=null){
			return moviels;
		}
		return null;
		}
		
	
	@Override
	public List<Movie> getMovieByBudget(Long startBudget,Long endBudget){
		List<Movie> moviels= movieRepository.findByBudgetBetween(startBudget,endBudget);
		if(moviels!=null){
			return moviels;
		}
		return null;
		}
	
	@Override
	public List<Movie> getMovieByReleaseDate(Date startDate,Date endDate){
		List<Movie> moviels= movieRepository.findByReleaseDateBetween(startDate,endDate);
		if(moviels!=null){
			return moviels;
		}
		return null;
		}
	
	@Override
	public List<Movie> findTopFiveMovies(){
		List<Movie> moviels= movieRepository.findTopFiveMovies();
		if(moviels!=null){
			return moviels;
		}
		return null;
		}
}
		
	
	


