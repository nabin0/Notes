package com.nabin0.notes.feature_note.data.repository.datasource

import com.nabin0.notes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteLocalDataSource {
    fun getAllNotes(): Flow<List<Note>>
    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)
    suspend fun getNoteById(noteId: Int): Note?
}