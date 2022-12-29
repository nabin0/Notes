package com.nabin0.notes.feature_note.data.repository

import com.nabin0.notes.feature_note.data.repository.datasource.NoteLocalDataSource
import com.nabin0.notes.feature_note.domain.model.Note
import com.nabin0.notes.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteLocalDataSource: NoteLocalDataSource
) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> {
        return noteLocalDataSource.getAllNotes()
    }

    override suspend fun insertNote(note: Note) {
        noteLocalDataSource.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteLocalDataSource.deleteNote(note)
    }

    override suspend fun getNoteById(noteId: Int): Note? {
        return noteLocalDataSource.getNoteById(noteId)
    }
}