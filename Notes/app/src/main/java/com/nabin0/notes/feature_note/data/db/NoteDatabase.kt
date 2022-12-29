package com.nabin0.notes.feature_note.data.db

import androidx.room.RoomDatabase
import com.nabin0.notes.feature_note.domain.model.Note

@androidx.room.Database(
    entities = [Note::class],
    exportSchema = false,
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_database"
    }
}