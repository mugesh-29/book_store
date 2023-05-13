package com.example.moviedirectors.impl;

import com.example.moviedirectors.modal.MovieDirectorEntity;
import com.example.moviedirectors.repository.MovieDirectorRepository;
import com.example.moviedirectors.repository.custom.ICustomMovieDirectorRepository;
import com.example.moviedirectors.requests.MovieDirectorRequest;
import com.example.moviedirectors.responses.MovieDirectorResponse;
import com.example.moviedirectors.services.MovieDirectorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service("movieDirectorService")
@Slf4j
public class MovieDirectorServiceImpl implements MovieDirectorService {

    @Autowired
    private MovieDirectorRepository movieDirectorRepository;

    @Autowired
    private ICustomMovieDirectorRepository customMovieDirectorRepository;

    @Override
    public MovieDirectorResponse createDirector(MovieDirectorRequest movieDirectorRequest) {
        log.debug("Creating Movie Director");

        MovieDirectorEntity movieDirector = new MovieDirectorEntity();

        movieDirector.setName(movieDirectorRequest.getName());
        movieDirector.setAge(movieDirectorRequest.getAge());
        movieDirector.setMoviesCount(movieDirectorRequest.getMoviesCount());
        movieDirector.setImageLink(movieDirectorRequest.getImageLink());
        movieDirector.setCreatedDate(new Date());
        movieDirector.setModifiedDate(new Date());

        movieDirectorRepository.save(movieDirector);

        MovieDirectorResponse movieDirectorResponse = MovieDirectorResponse.full(movieDirector);

        log.info("Created Movie Director");

        return movieDirectorResponse;
    }

    @Override
    public Integer getMoviesCountForDirector(String name) {
        log.debug("Fetching Movies Detailed Count By Director Name");

        MovieDirectorEntity movieDirector = customMovieDirectorRepository.fetchDirectorByName(name);

        log.info("Fetched Movies Detailed Count By Director Name");

        return movieDirector.getMoviesCount();
    }

    @Override
    public String getImageForDirector(String name) {
        log.debug("Fetching Director Image By Director's Name");

        MovieDirectorEntity movieDirector = customMovieDirectorRepository.fetchDirectorByName(name);

        log.info("Fetched Director Image By Director's Name");

        return movieDirector.getImageLink();
    }
}
