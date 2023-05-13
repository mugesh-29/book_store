package com.example.moviedirectors.repository;

import com.example.moviedirectors.modal.MovieDirectorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("movieDirectorRepository")
public interface MovieDirectorRepository extends MongoRepository<MovieDirectorEntity, String> {
}

