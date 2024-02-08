package com.example.movieapp

import java.io.Serializable

data class MovieSearchResponse(
    val Search: List<Movie>,
    val totalResults: Int,
    val Response: String
): Serializable
