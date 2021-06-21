package com.moviesreachwithmongdb.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Document(collection="movie")
public class Movie {

    @Id
    private String id;

    private String title;
    private float rating;
    private String genre;

}
