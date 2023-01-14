package com.example.storageapp.architecture

import android.app.Application
import com.example.storageapp.data.ItemRoomDatabase

class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy {ItemRoomDatabase.getDatabase(this)}
}