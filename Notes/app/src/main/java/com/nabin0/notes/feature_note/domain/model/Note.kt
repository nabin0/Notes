package com.nabin0.notes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nabin0.notes.ui.theme.*

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(
            Blue,
            Greenish,
            Pink,
            PaleYellow,
            LittleGray
        )
    }
}

class InvalidNoteException(message: String) : Exception(message)