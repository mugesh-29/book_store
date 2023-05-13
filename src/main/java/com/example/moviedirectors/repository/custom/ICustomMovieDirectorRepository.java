package com.example.moviedirectors.repository.custom;

import com.example.moviedirectors.modal.MovieDirectorEntity;

public interface ICustomMovieDirectorRepository {
    MovieDirectorEntity fetchDirectorByName(String name);
}
