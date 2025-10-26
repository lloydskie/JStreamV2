package com.jstreamv2.presentation.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0099\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u00a2\u0006\u0002\u0010#\u00a8\u0006$"}, d2 = {"DetailScreen", "", "backdropUrl", "", "posterUrl", "title", "rating", "", "releaseYear", "runtimeOrSeasons", "isFavorite", "", "isWatchlist", "onPlayClick", "Lkotlin/Function0;", "onFavoriteClick", "onWatchlistClick", "trailerKey", "overview", "cast", "", "Lcom/jstreamv2/presentation/ui/CastCardData;", "similar", "Lcom/jstreamv2/presentation/ui/MediaCardData;", "isTvShow", "seasons", "Lcom/jstreamv2/presentation/ui/SeasonData;", "selectedSeason", "onSeasonSelect", "Lkotlin/Function1;", "episodes", "Lcom/jstreamv2/presentation/ui/EpisodeData;", "modifier", "Landroidx/compose/ui/Modifier;", "onBack", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Lcom/jstreamv2/presentation/ui/SeasonData;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)V", "app_release"})
public final class DetailScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void DetailScreen(@org.jetbrains.annotations.Nullable
    java.lang.String backdropUrl, @org.jetbrains.annotations.Nullable
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Double rating, @org.jetbrains.annotations.Nullable
    java.lang.String releaseYear, @org.jetbrains.annotations.Nullable
    java.lang.String runtimeOrSeasons, boolean isFavorite, boolean isWatchlist, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onPlayClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavoriteClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onWatchlistClick, @org.jetbrains.annotations.Nullable
    java.lang.String trailerKey, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.CastCardData> cast, @org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.MediaCardData> similar, boolean isTvShow, @org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.SeasonData> seasons, @org.jetbrains.annotations.Nullable
    com.jstreamv2.presentation.ui.SeasonData selectedSeason, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.jstreamv2.presentation.ui.SeasonData, kotlin.Unit> onSeasonSelect, @org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.EpisodeData> episodes, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBack) {
    }
}