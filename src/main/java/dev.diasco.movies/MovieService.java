package dev.diasco.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    private List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Movie singleMovie(ObjectId id){
        return movieRepository.findById(id);
    }
}
