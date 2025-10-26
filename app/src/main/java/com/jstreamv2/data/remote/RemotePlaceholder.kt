
package com.jstreamv2.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import com.jstreamv2.data.model.MovieDto
import com.jstreamv2.data.model.PersonDto
import com.jstreamv2.data.model.GenreDto

interface MovieApiService {
	@GET("movies")
	suspend fun getMovies(): List<MovieDto>

	@GET("movies/{id}")
	suspend fun getMovieDetails(@Path("id") id: Int): MovieDto
}

interface PersonApiService {
	@GET("person/{id}")
	suspend fun getPersonDetails(@Path("id") id: Int): PersonDto
}

interface GenreApiService {
	@GET("genres")
	suspend fun getGenres(): List<GenreDto>
}
