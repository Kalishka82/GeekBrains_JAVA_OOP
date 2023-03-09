package web_07_notes.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    int createNote(Note note);

    void saveRepository(List<Note> notes);

    void updateNote(Note note, String fields, String param) throws Exception;

    void saveOneNote(Note note) throws Exception;
    void deleteNote(int id) throws Exception;
}
