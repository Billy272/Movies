package dev.diasco.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // create an override method to find a movie by imdbId
    Movie findMovieByImdbId(ObjectId imdbId);

}
