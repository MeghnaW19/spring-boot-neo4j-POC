package com.stackroute.springbootneo4j.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {

    @GraphId
    private Long id;
    private String movieTitle;
    private String movieDirector;

    public Movie() {
    }

    public Movie(Long id, String movieTitle, String movieDirector) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }
}
