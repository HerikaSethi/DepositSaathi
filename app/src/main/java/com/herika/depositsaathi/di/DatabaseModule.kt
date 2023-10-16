package com.herika.depositsaathi.di

import android.app.Application

import com.herika.depositsaathi.room.DepositDao
import com.herika.depositsaathi.room.DepositDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun getDepositDatabase(context: Application): DepositDatabase {
        return DepositDatabase.getDatabaseInstance(context)
    }

    @Singleton
    @Provides
    fun provideDepositDao(database: DepositDatabase): DepositDao {
        return database.depositDao()
    }
}