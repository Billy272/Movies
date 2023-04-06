package dev.diasco.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    private List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public <imdbId> Optional<Movie> singleMovie(imdbId id, String imdbId){

        //return movieRepository.findMovieByImdbId(id);
        return movieRepository.findMovieByImdbId(id);

    }
}
