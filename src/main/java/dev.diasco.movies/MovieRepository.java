package dev.diasco.movies;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie,ObjectId> {
    @Override
    Optional<Movie> findMovieByImdbId(String imdbId);
}
