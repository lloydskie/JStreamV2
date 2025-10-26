
package com.jstreamv2.domain.model

data class Movie(
	val id: Int,
	val title: String,
	val overview: String,
	val posterUrl: String
)

data class Person(
	val id: Int,
	val name: String,
	val profileUrl: String
)

data class Genre(
	val id: Int,
	val name: String
)

data class Favorite(
	val id: Int,
	val movie: Movie
)

data class WatchlistItem(
	val id: Int,
	val movie: Movie
)
