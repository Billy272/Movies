package dev.diasco.movies;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie,ObjectId> {

}
