package com.java.advanced.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesClientTest {

    MoviesClient moviesClient = new MoviesClient();

    @Test
    void getMovieById(){
        var movie = moviesClient.getMovieById();
        assertNotNull(movie);
        assertEquals("Batman Begins", movie.name());
    }

    @Test
    void getMovieByIdAsync(){
        var movie = moviesClient.getMovieByIdAsync().join();
        assertNotNull(movie);
        assertEquals("Batman Begins", movie.name());
    }

    @Test
    void getAllMovies(){
        var moviesList = moviesClient.getAllMovies();
        assert moviesList.size() == 10;
    }

}