package com.example.moviedirectors.resources;

import com.example.moviedirectors.requests.MovieDirectorRequest;
import com.example.moviedirectors.responses.MovieDirectorResponse;
import com.example.moviedirectors.services.MovieDirectorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/1.0/movie-directors")
@Slf4j
public class MovieDirectorResource {

    @Autowired
    private MovieDirectorService movieDirectorService;

    @PostMapping("/create")
    public ResponseEntity<MovieDirectorResponse> createMovieDirector(@RequestBody MovieDirectorRequest movieDirectorRequest) {
        log.debug("Received request for Inserting the Director Details");

        MovieDirectorResponse movieDirectorResponse = movieDirectorService.createDirector(movieDirectorRequest);

        log.info("Processed request for Inserting the Director Details");

        return ResponseEntity.ok(movieDirectorResponse);
    }

    @GetMapping("/getMoviesCount")
    public ResponseEntity<Integer> getMoviesCount(@RequestParam("name") String name) {
        log.debug("Received request for To get Movies Count Details By Director name ");

        Integer getMoviesCount = movieDirectorService.getMoviesCountForDirector(name);

        log.info("Processed request for To get Movies Count Details By Director name ");

        return ResponseEntity.ok(getMoviesCount);
    }

    @GetMapping("/getDirectorImage")
    public ResponseEntity<String> getDirectorImage(@RequestParam("name") String name) {
        log.debug("Received request for To get Director Image By Director name ");

        String directorImage = movieDirectorService.getImageForDirector(name);

        log.info("Processed request for To get Director Image By Director name ");

        return ResponseEntity.ok(directorImage);
    }
}
