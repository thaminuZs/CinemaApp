import java.util.*;

class Movie {
    private long movieId;
    private String movieName;
    private String genre;
    private String studio;
    private String language;
    private String runtime;
    private double rating;
    private List<String> directorList;
    private List<String> castList;

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setDirectors(List<String> directorList) {
        this.directorList = directorList; 
    }

    public void setCast(List<String> castList) {
        this.castList = castList;
    }

}