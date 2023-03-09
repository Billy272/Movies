package dev.diasco.movies;


import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collectiom = "movies")
public class Movie {
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

}
