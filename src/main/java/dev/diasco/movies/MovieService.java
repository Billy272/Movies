package dev.diasco.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public <imdbId> Movie singleMovie(ObjectId imdbId, ObjectId imdbId2) {

        // return movieRepository.findMovieByImdbId(id);
        return movieRepository.findMovieByImdbId(imdbId);

    }
}
