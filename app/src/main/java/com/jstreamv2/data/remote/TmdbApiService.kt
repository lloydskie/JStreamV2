package com.jstreamv2.data.remote

import com.jstreamv2.data.model.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Header

interface TmdbApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Header("Authorization") auth: String, @Query("page") page: Int = 1): MovieListResponse

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Header("Authorization") auth: String, @Query("page") page: Int = 1): MovieListResponse

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Header("Authorization") auth: String, @Query("page") page: Int = 1): MovieListResponse

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(@Header("Authorization") auth: String, @Path("movie_id") movieId: Int): MovieDetailsResponse

    @GET("movie/{movie_id}/videos")
    suspend fun getMovieVideos(@Header("Authorization") auth: String, @Path("movie_id") movieId: Int): VideoListResponse

    @GET("movie/{movie_id}/credits")
    suspend fun getMovieCredits(@Header("Authorization") auth: String, @Path("movie_id") movieId: Int): CreditsResponse

    @GET("tv/popular")
    suspend fun getPopularTv(@Header("Authorization") auth: String, @Query("page") page: Int = 1): TvListResponse

    @GET("tv/top_rated")
    suspend fun getTopRatedTv(@Header("Authorization") auth: String, @Query("page") page: Int = 1): TvListResponse

    @GET("tv/{series_id}")
    suspend fun getTvDetails(@Header("Authorization") auth: String, @Path("series_id") seriesId: Int): TvDetailsResponse

    @GET("tv/{series_id}/videos")
    suspend fun getTvVideos(@Header("Authorization") auth: String, @Path("series_id") seriesId: Int): VideoListResponse

    @GET("tv/{series_id}/credits")
    suspend fun getTvCredits(@Header("Authorization") auth: String, @Path("series_id") seriesId: Int): CreditsResponse

    @GET("search/movie")
    suspend fun searchMovies(@Header("Authorization") auth: String, @Query("query") query: String, @Query("page") page: Int = 1): MovieListResponse

    @GET("search/tv")
    suspend fun searchTv(@Header("Authorization") auth: String, @Query("query") query: String, @Query("page") page: Int = 1): TvListResponse

    @GET("search/person")
    suspend fun searchPerson(@Header("Authorization") auth: String, @Query("query") query: String, @Query("page") page: Int = 1): PersonListResponse

    @GET("genre/movie/list")
    suspend fun getMovieGenres(@Header("Authorization") auth: String): GenreListResponse

    @GET("genre/tv/list")
    suspend fun getTvGenres(@Header("Authorization") auth: String): GenreListResponse

    @GET("discover/movie")
    suspend fun discoverMovies(@Header("Authorization") auth: String, @Query("with_genres") genreId: Int, @Query("page") page: Int = 1): MovieListResponse

    @GET("discover/tv")
    suspend fun discoverTv(@Header("Authorization") auth: String, @Query("with_genres") genreId: Int, @Query("page") page: Int = 1): TvListResponse

    @GET("person/{person_id}/movie_credits")
    suspend fun getPersonMovieCredits(@Header("Authorization") auth: String, @Path("person_id") personId: Int): PersonMovieCreditsResponse

    @GET("person/{person_id}/tv_credits")
    suspend fun getPersonTvCredits(@Header("Authorization") auth: String, @Path("person_id") personId: Int): PersonTvCreditsResponse
}
