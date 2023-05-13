package com.example.moviedirectors.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDirectorRequest {
    private String name;
    private int age;
    private int moviesCount;
    private String imageLink;
}
