package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {

    Map<Movie, Integer> movieMap= new LinkedHashMap<>() ;

    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
    public MovieService() {
    }

    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {

        return movieMap;
    }

    /*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {

        movieMap.put(movie, rating);
        Set movieSet= movieMap.entrySet();
        return movieSet;
    }

    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {
    List<String> movieList=new ArrayList<>();

        for(Map.Entry<Movie,Integer> movie : movieMap.entrySet()){
            int i = (int)movie.getValue();
            if(i>=rating)
            {
                Movie mo=(Movie) movie.getKey();
                String str= mo.getMovieName();
                movieList.add(str);
            }
        }
        return movieList;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {
        List<String> movieList=new ArrayList<>();
        for(Map.Entry<Movie,Integer> movie : movieMap.entrySet()){
                Movie mo=(Movie) movie.getKey();
                String str= mo.getGenre();
                if(str==genre){
                    String str1=mo.getMovieName();
                movieList.add(str1);}

        }

        return movieList;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
    */

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
        List<String> movieList=new ArrayList<>();
        for(Map.Entry<Movie,Integer> movie : movieMap.entrySet()){
            Movie mo= (Movie) movie.getKey();
            LocalDate ld=mo.getReleaseDate();
            int i=(int) movie.getValue(); //rating

            if((ld.compareTo(releaseDate)>0) && i<=3)
            {
                String str=mo.getMovieName();
                movieList.add(str);
            }
        }



        return movieList;
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
        List<Movie> movieList= new ArrayList<>();

        for(Map.Entry<Movie, Integer> movie: movieMap.entrySet()) {
            movieList.add(movie.getKey());
        }

        Comparator<Movie> releaseDateComparator = new Comparator<Movie>() {

            @Override
            public int compare(Movie m1, Movie m2) {
                LocalDate d1 = m1.getReleaseDate();
                LocalDate d2 = m2.getReleaseDate();
                return d1.compareTo(d2);
            }
        };
        Collections.sort(movieList, releaseDateComparator);

        return movieList;
    }

    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating() {
        ArrayList<Map.Entry<Movie, Integer>> movieList= new ArrayList<>();
        Map<Movie,Integer> movieMap=new LinkedHashMap<>();

        for(Map.Entry<Movie, Integer> e: this.movieMap.entrySet()) {
            movieList.add(e);
        }

        Comparator<Map.Entry<Movie, Integer>> ratingComparator = new Comparator<Map.Entry<Movie, Integer>>() {

            @Override
            public int compare(Map.Entry<Movie, Integer> o1, Map.Entry<Movie, Integer> o2) {
                Integer v1 = o1.getValue();
                Integer v2 = o2.getValue();
                return v1.compareTo(v2);
            }
        };
        Collections.sort(movieList, ratingComparator);

        for(Map.Entry<Movie, Integer> e: movieList) {
            movieMap.put(e.getKey(), e.getValue());
        }
        return movieMap;
    }
}
