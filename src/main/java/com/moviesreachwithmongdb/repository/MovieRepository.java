package com.moviesreachwithmongdb.repository;

import com.moviesreachwithmongdb.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie,String> {

}
