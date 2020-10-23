package com.cts.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.MovieDao;
import com.cts.model.Movie;

@Service
public class MovieserviceImpl implements Movieservice {
	

		@Autowired
		MovieDao movieDao;
		
		@Override
		public List<Movie> getAllMovies() {
			return movieDao.getAllMovies();
		}
		@Override
		public Movie getMovieById(int id) {
			return movieDao.getMovieById(id);
		}
		
		@Override
		public Movie getMovieByName(String name) {
			return movieDao.getMovieByName(name);
		}
		
		@Override
		public List<Movie> getMovieByLanguage(String language){
			return (List<Movie>)movieDao.getMovieByLang(language);
		}
		
		@Override
		public List<Movie> getMovieByBudget(Long startBudget,Long endBudget){
			return (List<Movie>)movieDao.getMovieByBudget(startBudget,endBudget);
		}
		@Override
		public  List<Movie> getMovieByReleaseDate(Date startDate,Date endDate){
			return (List<Movie>)movieDao.getMovieByReleaseDate(startDate,endDate);
		}
		@Override
		public List<Movie> gettopFiveMovies(){
			return (List<Movie>) movieDao.findTopFiveMovies();
		}
		

}
