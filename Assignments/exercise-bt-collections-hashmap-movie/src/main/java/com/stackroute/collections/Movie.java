package com.stackroute.collections;

import java.time.LocalDate;
import java.util.Comparator;

/*
Movie class has four fields- movieId,movieName, genre and releaseDate
This class should be of Comparable type comparing movies based on releaseDate
 */
public class Movie implements Comparable<Movie>{

    private int movieId;
    private String movieName;
    private String genre;
    private LocalDate releaseDate;

    public Movie(int movieId, String movieName, String genre, LocalDate releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", releaseDate="
                + releaseDate + "]";
    }


    @Override
    public int compareTo(Movie movie) {

        return this.compareTo(movie);
    }
public static  final Comparator<Movie> COMPARE_BY_RELEASE=new Comparator<Movie>() {
    @Override
    public int compare(Movie m1, Movie m2) {



        return m1.getReleaseDate().compareTo(m2.getReleaseDate());
    }
};


}
