package com.jstreamv2.presentation.ui.screens;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.detectSwipe;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.material3.*;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0091\u0001\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\n26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007\u001a$\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0013H\u0007\u001a\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001c\u001a\u00020\u0018\u00a8\u0006\u001d"}, d2 = {"EmptyState", "", "tab", "", "MyListScreen", "favorites", "", "Lcom/jstreamv2/presentation/ui/screens/MyListItem;", "watchlist", "isOnline", "", "onDelete", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "itemId", "isFavorite", "onItemClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "SortDropdown", "selected", "Lcom/jstreamv2/presentation/ui/screens/SortOption;", "onSelect", "sortItems", "items", "option", "app_release"})
public final class MyListScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable
    public static final void MyListScreen(@org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.screens.MyListItem> favorites, @org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.screens.MyListItem> watchlist, boolean isOnline, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onDelete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SortDropdown(@org.jetbrains.annotations.NotNull
    com.jstreamv2.presentation.ui.screens.SortOption selected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.jstreamv2.presentation.ui.screens.SortOption, kotlin.Unit> onSelect) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.jstreamv2.presentation.ui.screens.MyListItem> sortItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.jstreamv2.presentation.ui.screens.MyListItem> items, @org.jetbrains.annotations.NotNull
    com.jstreamv2.presentation.ui.screens.SortOption option) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void EmptyState(@org.jetbrains.annotations.NotNull
    java.lang.String tab) {
    }
}