package com.example.movieapp

import java.io.Serializable

data class Movie(
    val Title: String,
    val Year: String,
    val imdbID: String,
    val Type: String,
    val Poster: String
): Serializable
