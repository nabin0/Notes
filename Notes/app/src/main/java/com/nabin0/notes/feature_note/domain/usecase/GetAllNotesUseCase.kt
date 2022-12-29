package com.nabin0.notes.feature_note.domain.usecase

import androidx.compose.ui.text.toLowerCase
import com.nabin0.notes.feature_note.domain.model.Note
import com.nabin0.notes.feature_note.domain.repository.NoteRepository
import com.nabin0.notes.feature_note.domain.util.NoteOrder
import com.nabin0.notes.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetAllNotesUseCase(
    private val noteRepository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        // Get Notes and sort them here
        return noteRepository.getAllNotes().map { allNotes ->
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> allNotes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> allNotes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> allNotes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> allNotes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> allNotes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> allNotes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}