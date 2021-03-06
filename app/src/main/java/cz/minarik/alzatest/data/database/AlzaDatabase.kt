package cz.minarik.alzatest.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import cz.minarik.alzatest.data.database.dao.CategoryDao
import cz.minarik.alzatest.data.database.entity.CategoryEntity

@Database(
    entities = [
        CategoryEntity::class,
    ],
    version = 1
)

abstract class AlzaDatabase : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
}