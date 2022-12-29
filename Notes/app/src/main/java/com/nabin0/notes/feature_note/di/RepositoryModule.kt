package com.nabin0.notes.feature_note.di

import com.nabin0.notes.feature_note.data.repository.NoteRepositoryImpl
import com.nabin0.notes.feature_note.data.repository.datasource.NoteLocalDataSource
import com.nabin0.notes.feature_note.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(noteLocalDataSource: NoteLocalDataSource): NoteRepository{
        return NoteRepositoryImpl(noteLocalDataSource)
    }
}