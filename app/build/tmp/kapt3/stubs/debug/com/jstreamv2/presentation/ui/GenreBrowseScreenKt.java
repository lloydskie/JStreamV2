package com.jstreamv2.presentation.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aH\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u009e\u0001\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0007\u001a2\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006 "}, d2 = {"DropdownMenuButton", "", "options", "", "", "selectedOption", "onOptionSelected", "Lkotlin/Function1;", "GenreBrowseScreen", "movieGenres", "tvGenres", "onGenreClick", "Lkotlin/Function2;", "", "modifier", "Landroidx/compose/ui/Modifier;", "GenreResultsScreen", "genre", "isMovie", "results", "Lcom/jstreamv2/presentation/ui/MediaCardData;", "onResultClick", "onSortChange", "sortOptions", "selectedSort", "onFilterToggle", "showMovies", "onLoadMore", "Lkotlin/Function0;", "SegmentedButton", "selectedIndex", "", "app_debug"})
public final class GenreBrowseScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void GenreBrowseScreen(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> movieGenres, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> tvGenres, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> onGenreClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void GenreResultsScreen(@org.jetbrains.annotations.NotNull
    java.lang.String genre, boolean isMovie, @org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.MediaCardData> results, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.jstreamv2.presentation.ui.MediaCardData, kotlin.Unit> onResultClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSortChange, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sortOptions, @org.jetbrains.annotations.NotNull
    java.lang.String selectedSort, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFilterToggle, boolean showMovies, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SegmentedButton(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> options, int selectedIndex, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOptionSelected) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DropdownMenuButton(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> options, @org.jetbrains.annotations.NotNull
    java.lang.String selectedOption, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onOptionSelected) {
    }
}