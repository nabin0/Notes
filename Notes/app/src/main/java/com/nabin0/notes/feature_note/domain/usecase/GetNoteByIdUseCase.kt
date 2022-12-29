package com.nabin0.notes.feature_note.domain.usecase

import com.nabin0.notes.feature_note.domain.model.Note
import com.nabin0.notes.feature_note.domain.repository.NoteRepository

class GetNoteByIdUseCase(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(noteId: Int): Note? {
        return noteRepository.getNoteById(noteId)
    }
}