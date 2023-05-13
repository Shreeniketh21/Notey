package com.shreenikethneyaz.notey.listeners;

import android.view.View;

import com.shreenikethneyaz.notey.entities.Note;

public interface NotesListener {
    void onNoteClicked(View view, Note note, int position);

    void onNoteLongClicked(View view, Note note, int position);
}
