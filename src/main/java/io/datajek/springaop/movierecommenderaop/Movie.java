package io.datajek.springaop.movierecommenderaop;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {

    @MeasureTime
    public String getMovieDetails() {
        //interacts with the Movie repository
        return "movie details";
    }
}