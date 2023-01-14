package com.example.storageapp.data

import androidx.core.location.LocationRequestCompat.Quality
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
   @Query("SELECT * from item ORDER BY name ASC")
   fun getAllItems(): Flow<List<Item>>

   @Query("SELECT * from item WHERE id = :id")
   fun getItem(id: Int): Flow<Item>

   @Insert(onConflict = OnConflictStrategy.IGNORE)
   suspend fun insert(item: Item)

   @Update
   suspend fun update(item: Item)

   @Delete
   suspend fun delete(item: Item)
}