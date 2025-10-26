package com.jstreamv2.data.local;

import androidx.room.*;
import com.jstreamv2.data.model.FavoriteEntity;
import com.jstreamv2.data.model.WatchlistEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/jstreamv2/data/local/FavoritesDao;", "", "delete", "", "favorite", "Lcom/jstreamv2/data/model/FavoriteEntity;", "getAll", "", "insert", "app_debug"})
@androidx.room.Dao
public abstract interface FavoritesDao {
    
    @androidx.room.Query(value = "SELECT * FROM favorites")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.jstreamv2.data.model.FavoriteEntity> getAll();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.model.FavoriteEntity favorite);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.model.FavoriteEntity favorite);
}