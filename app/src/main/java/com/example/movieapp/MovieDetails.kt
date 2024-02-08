package com.example.movieapp

import java.io.Serializable

data class MovieDetails(
    val Title: String,
    val Year: String,
    val Rated: String,
    val Released: String,
    val Runtime: String
):Serializable
