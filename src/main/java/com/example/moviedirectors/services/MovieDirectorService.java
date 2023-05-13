package com.example.moviedirectors.services;

import com.example.moviedirectors.requests.MovieDirectorRequest;
import com.example.moviedirectors.responses.MovieDirectorResponse;

public interface MovieDirectorService {
    MovieDirectorResponse createDirector(MovieDirectorRequest movieDirectorRequest);

    Integer getMoviesCountForDirector(String name);

    String getImageForDirector(String name);
}
