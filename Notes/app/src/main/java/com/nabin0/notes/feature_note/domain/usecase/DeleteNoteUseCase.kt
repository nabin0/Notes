package com.nabin0.notes.feature_note.domain.usecase

import com.nabin0.notes.feature_note.domain.model.Note
import com.nabin0.notes.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note)
    }
}