package com.example.moviedirectors.modal;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@Document(collection = "movie_directors")
@TypeAlias("movie_directors")
public class MovieDirectorEntity {

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("age")
    private int age;

    @Field("moviesCount")
    private int moviesCount;

    @Field("image")
    private String imageLink;

    @Field("created_date")
    private Date createdDate;

    @Field("modified_date")
    private Date modifiedDate;
}
