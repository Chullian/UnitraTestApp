package com.chullian.app.di.modules

import android.content.Context
import androidx.room.Room
import com.chullian.app.persistance.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun providesDatabaseModule(context: Context): AppDatabase {
        return Room.databaseBuilder(
            context, AppDatabase::class.java, "AppDatabase"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}