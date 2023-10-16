package com.herika.depositsaathi.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [DepositEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class DepositDatabase : RoomDatabase() {

    abstract fun depositDao(): DepositDao

    companion object {

        private var INSTANCE: DepositDatabase? = null

        fun getDatabaseInstance(context: Context): DepositDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context.applicationContext).also { INSTANCE = it }
            }
        }

        private fun buildDatabase(context: Context): DepositDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                DepositDatabase::class.java,
                "deposit_database"
            ).build()
        }
    }
}
