package com.nabin0.notes.feature_note.data.repository.datasourceimpl

import com.nabin0.notes.feature_note.data.db.NoteDao
import com.nabin0.notes.feature_note.data.repository.datasource.NoteLocalDataSource
import com.nabin0.notes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteLocalDataSourceImpl(
    private val noteDao: NoteDao
) : NoteLocalDataSource {
    override fun getAllNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }

    override suspend fun getNoteById(noteId: Int): Note? {
        return noteDao.getNoteById(id = noteId)
    }

}