package com.osdev.notes.listeners;

import com.osdev.notes.entities.Note;

public interface NotesListener {

    void onNoteClicked(Note note, int position);

}
