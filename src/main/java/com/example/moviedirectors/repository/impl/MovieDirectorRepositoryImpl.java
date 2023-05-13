package com.example.moviedirectors.repository.impl;

import com.example.moviedirectors.modal.MovieDirectorEntity;
import com.example.moviedirectors.repository.custom.ICustomMovieDirectorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Slf4j
public class MovieDirectorRepositoryImpl implements ICustomMovieDirectorRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public MovieDirectorEntity fetchDirectorByName(String name) {
        log.debug("Fetching Movie Director By name {}", name);

        Criteria criteria = Criteria.where("name").regex(name);

        Query query = new Query(criteria);

        log.info("Fetched Movie Director By name {}", name);

        return mongoTemplate.findOne(query, MovieDirectorEntity.class);
    }
}
