package com.java.advanced.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class MoviesClient {

    HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(2))
            .build();

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);


    public static String ALL_MOVIES_URL = "http://127.0.0.1:8000/src/main/resources/movies.json";
    public static String MOVIES_BY_ID_URL = "http://127.0.0.1:8000/src/main/resources/movies_by_id.json";

    public Movie getMovieById(){
       var request =  requestBuilder(MOVIES_BY_ID_URL);
       try {
           var response = client.send(request, HttpResponse.BodyHandlers.ofString());
           System.out.println("response status code============"+response.statusCode());
           return objectMapper.readValue(response.body(), Movie.class);
       }catch (Exception e){
            System.err.println(e);
            throw new RuntimeException(e);
       }
    }

    public static HttpRequest requestBuilder(String url){
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
    }
}
