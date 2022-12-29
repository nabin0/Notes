package com.nabin0.notes.feature_note.domain.usecase

import com.nabin0.notes.feature_note.domain.model.InvalidNoteException
import com.nabin0.notes.feature_note.domain.model.Note
import com.nabin0.notes.feature_note.domain.repository.NoteRepository

class InsertNoteUseCase(
    private val noteRepository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title can't be empty.")
        } else if (note.content.isBlank()) {
            throw InvalidNoteException("Content can't be empty.")
        }
        noteRepository.insertNote(note)
    }
}