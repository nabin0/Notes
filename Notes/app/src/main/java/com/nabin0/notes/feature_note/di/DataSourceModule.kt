package com.nabin0.notes.feature_note.di

import com.nabin0.notes.feature_note.data.db.NoteDao
import com.nabin0.notes.feature_note.data.repository.datasource.NoteLocalDataSource
import com.nabin0.notes.feature_note.data.repository.datasourceimpl.NoteLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun provideLocalNoteDataSource(noteDao: NoteDao): NoteLocalDataSource {
        return NoteLocalDataSourceImpl(noteDao)
    }
}