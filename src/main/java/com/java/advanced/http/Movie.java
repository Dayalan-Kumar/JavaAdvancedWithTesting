package com.java.advanced.http;

import java.time.LocalDate;

// representation of movies.json present in resources pkg

public record Movie(
        Double movie_id,
        String name,
        String cast,
        Integer year,
        LocalDate release_date
) {
}
