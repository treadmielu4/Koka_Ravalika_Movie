package com.cts.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Movie;
import com.cts.repository.MovieRepository;
import com.cts.service.Movieservice;

@RestController
public class Moviecontroller {
	
	@Autowired
	Movieservice service;
	
	 
	
       @GetMapping("/movies")
		public List<Movie> getAllMovies(){
			return service.getAllMovies();
			
		}
		
		
       @GetMapping(value = "/movies/getMovieById/{id}")
   	public ResponseEntity<Object> searchById(@PathVariable("id") Integer id)
   	{
   		
   			Movie movie=service.getMovieById(id);
   			if(movie!=null) {
   				
   				return new ResponseEntity<>(movie,HttpStatus.OK);	
   			}
   			else
   			return new ResponseEntity<>("Record Not Found",HttpStatus.OK);
   				
   	}

		
       @GetMapping(value = "/movies/getMovieByName/{name}")
      	public ResponseEntity<Object> searchByName(@PathVariable("name") String name)
      	{
      		
      			Movie movie=service.getMovieByName(name);
      			if(movie!=null) {
      				
      				return new ResponseEntity<>(movie,HttpStatus.OK);	
      			}
      			else
      			return new ResponseEntity<>("Record Not Found",HttpStatus.OK);
      				
      	}
       @GetMapping(value="/movies/getMovieBylanguage/{language}")
   	public ResponseEntity<?> searchMovieBylanguage(@PathVariable("language") String language)
   	{
   		List<Movie> moviels = service.getMovieByLanguage(language);
   		if(moviels!=null) {
				
				return new ResponseEntity<>(moviels,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Record Not Found",HttpStatus.OK);
   	}
       
       
       @GetMapping(value="/movies/getMovieByBudget/{startBudget}/{endBudget}")
   	public ResponseEntity<?> searchMovieByBudget(@PathVariable("startBudget") Long startBudget, @PathVariable("endBudget") Long endBudget)
   	{
   		List<Movie> m = service.getMovieByBudget(startBudget,endBudget);
   		if(m.size()==0){
   			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
   		}
   		return new ResponseEntity<List<Movie>>(m,HttpStatus.OK);
   	}
       @GetMapping(value="/movies/getMovieByReleaseDate/{startDate}/{endDate}")
      	public ResponseEntity<?> searchMovieByDate(@PathVariable("startDate") Date startDate, @PathVariable("endDate") Date endDate)
      	{
      		List<Movie> m = service.getMovieByReleaseDate(startDate,endDate);
      		if(m.size()==0){
      			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
      		}
      		return new ResponseEntity<List<Movie>>(m,HttpStatus.OK);
      	}
       @GetMapping(value="/movies/topFiveMovies")
   	public ResponseEntity<?> topFiveStocks()
   	{
   		return new ResponseEntity<List<Movie>>(service.gettopFiveMovies(),HttpStatus.OK);
   	}
	
	  
}
				

		
