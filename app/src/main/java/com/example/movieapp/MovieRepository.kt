package com.example.movieapp

//class MovieRepository {
//}

import com.google.gson.Gson
import java.net.URL

object MovieRepository {
    suspend fun searchMovies(apiKey: String, searchString: String): List<Movie> {
        val url = "http://www.omdbapi.com/?apikey=$apiKey&s=$searchString"
        val response = URL(url).readText()
        val searchResult = Gson().fromJson(response, SearchResult::class.java)
        return searchResult.search
    }

    suspend fun getMovieDetails(apiKey: String, imdbID: String): MovieDetails {
        val url = "http://www.omdbapi.com/?apikey=$apiKey&i=$imdbID"
        val response = URL(url).readText()
        return Gson().fromJson(response, MovieDetails::class.java)
    }
}

data class SearchResult(val search: List<Movie>)
data class Movie(val title: String, val imdbID: String)
data class MovieDetails(
    val title: String,
    val year: String,
    val rated: String,
    val released: String,
    val runtime: String,
    val genre: String,
    val director: String,
    val writer: String,
    val actors: String,
    val plot: String,
    val language: String,
    val country: String,
    val awards: String,
    val poster: String,
    val ratings: List<Rating>,
    val metascore: String,
    val imdbRating: String,
    val imdbVotes: String,
    val imdbID: String,
    val type: String,
    val dvd: String,
    val boxOffice: String,
    val production: String,
    val website: String,
    val response: String
)

data class Rating(val source: String, val value: String)
