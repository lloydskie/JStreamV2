package com.jstreamv2.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ/\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001d\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010$\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J%\u0010%\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010&\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ/\u0010\'\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J/\u0010*\u001a\u00020+2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J/\u0010,\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/jstreamv2/data/remote/TmdbApiService;", "", "discoverMovies", "Lcom/jstreamv2/data/model/MovieListResponse;", "auth", "", "genreId", "", "page", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discoverTv", "Lcom/jstreamv2/data/model/TvListResponse;", "getMovieCredits", "Lcom/jstreamv2/data/model/CreditsResponse;", "movieId", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetails", "Lcom/jstreamv2/data/model/MovieDetailsResponse;", "getMovieGenres", "Lcom/jstreamv2/data/model/GenreListResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieVideos", "Lcom/jstreamv2/data/model/VideoListResponse;", "getPersonMovieCredits", "Lcom/jstreamv2/data/model/PersonMovieCreditsResponse;", "personId", "getPersonTvCredits", "Lcom/jstreamv2/data/model/PersonTvCreditsResponse;", "getPopularMovies", "getPopularTv", "getTopRatedMovies", "getTopRatedTv", "getTvCredits", "seriesId", "getTvDetails", "Lcom/jstreamv2/data/model/TvDetailsResponse;", "getTvGenres", "getTvVideos", "getUpcomingMovies", "searchMovies", "query", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchPerson", "Lcom/jstreamv2/data/model/PersonListResponse;", "searchTv", "app_debug"})
public abstract interface TmdbApiService {
    
    @retrofit2.http.GET(value = "movie/popular")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPopularMovies(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.MovieListResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/top_rated")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTopRatedMovies(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.MovieListResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/upcoming")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUpcomingMovies(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.MovieListResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.MovieDetailsResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}/videos")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieVideos(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.VideoListResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}/credits")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieCredits(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.CreditsResponse> $completion);
    
    @retrofit2.http.GET(value = "tv/popular")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPopularTv(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.TvListResponse> $completion);
    
    @retrofit2.http.GET(value = "tv/top_rated")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTopRatedTv(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.TvListResponse> $completion);
    
    @retrofit2.http.GET(value = "tv/{series_id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTvDetails(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "series_id")
    int seriesId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.TvDetailsResponse> $completion);
    
    @retrofit2.http.GET(value = "tv/{series_id}/videos")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTvVideos(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "series_id")
    int seriesId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.VideoListResponse> $completion);
    
    @retrofit2.http.GET(value = "tv/{series_id}/credits")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTvCredits(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "series_id")
    int seriesId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.CreditsResponse> $completion);
    
    @retrofit2.http.GET(value = "search/movie")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchMovies(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.MovieListResponse> $completion);
    
    @retrofit2.http.GET(value = "search/tv")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchTv(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.TvListResponse> $completion);
    
    @retrofit2.http.GET(value = "search/person")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchPerson(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.PersonListResponse> $completion);
    
    @retrofit2.http.GET(value = "genre/movie/list")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieGenres(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.GenreListResponse> $completion);
    
    @retrofit2.http.GET(value = "genre/tv/list")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTvGenres(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.GenreListResponse> $completion);
    
    @retrofit2.http.GET(value = "discover/movie")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object discoverMovies(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "with_genres")
    int genreId, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.MovieListResponse> $completion);
    
    @retrofit2.http.GET(value = "discover/tv")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object discoverTv(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Query(value = "with_genres")
    int genreId, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.TvListResponse> $completion);
    
    @retrofit2.http.GET(value = "person/{person_id}/movie_credits")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPersonMovieCredits(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "person_id")
    int personId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.PersonMovieCreditsResponse> $completion);
    
    @retrofit2.http.GET(value = "person/{person_id}/tv_credits")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPersonTvCredits(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String auth, @retrofit2.http.Path(value = "person_id")
    int personId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.model.PersonTvCreditsResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}