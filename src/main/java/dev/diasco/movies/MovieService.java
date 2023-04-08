package dev.diasco.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    /**
     * @param <imdbId>
     * @param imdbId
     * @param imdbId2
     * @return
     */
    public <imdbId> Optional<Movie> singleMovie(ObjectId imdbId, ObjectId imdbId2) {

        // return movieRepository.findMovieByImdbId(id);
        return movieRepository.findMovieByImdbId(imdbId);

    }
}
