package dev.diasco.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "movies")
public class Movie {
    private ObjectId id;

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id){
        this.id = id;
    }

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

}
