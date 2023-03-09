package web_07_notes.controller;

import web_07_notes.model.Note;
import web_07_notes.model.Repository;


import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        repository.createNote(note);
    }

    public void updateNote(Note note, String field, String param) throws Exception {
        repository.updateNote(note, field, param);
    }

    public Note readNote(int id) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId() == id) return note;
        }

        throw new Exception("Заметка не найдена");
    }

    public List<Note> getNotes() {
        return repository.getAllNotes();
    }


    public void deleteNote(int id) throws Exception {
        repository.deleteNote(id);
    }

    public Note getNoteById(int id) throws Exception{
        List<Note> notes = repository.getAllNotes();
        Note noteFind = null;
        for (Note note : notes) {
            if (note.getId() == id) {
                noteFind = note;
                break;
            }
        }
        return noteFind;
    }

    public void noteUpdate(Note updateNote) {
        List<Note> notes = repository.getAllNotes();
        Note noteToBeUpdated = notes.stream().filter(p -> p.getId() == (updateNote.getId())).findFirst().orElse(null);
        if (noteToBeUpdated != null) {
            noteToBeUpdated.setTitle(updateNote.getTitle());
            noteToBeUpdated.setText(updateNote.getText());
            repository.saveRepository(notes);
        } else {
            System.out.println("Заметка с номером: " + updateNote.getId() + " не найдена");
        }

    }
}