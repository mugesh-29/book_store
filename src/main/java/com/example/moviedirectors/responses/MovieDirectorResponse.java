package com.example.moviedirectors.responses;


import com.example.moviedirectors.modal.MovieDirectorEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDirectorResponse {
    private String name;
    private int age;
    private int moviesCount;
    private String imageLink;

    public static MovieDirectorResponse full(MovieDirectorEntity movieDirector) {
        if(movieDirector ==  null) {
            return  null;
        }

        MovieDirectorResponse movieDirectorResponse = new MovieDirectorResponse();

        movieDirectorResponse.setName(movieDirector.getName());
        movieDirectorResponse.setAge(movieDirector.getAge());
        movieDirectorResponse.setImageLink(movieDirector.getImageLink());
        movieDirectorResponse.setMoviesCount(movieDirector.getMoviesCount());

        return movieDirectorResponse;
    }
}