package web_07_notes.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private Mapper mapper;
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation, Mapper mapper) {
        this.fileOperation = fileOperation;
        this.mapper = mapper;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            if (line != null) {
                notes.add(mapper.map(line));
            }
        }
        return notes;
    }

    @Override
//    public String createNote(Note note) {
    public int createNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = item.getId();
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        int id = newId;
        note.setId(id);
        notes.add(note);
        saveRepository(notes);
//        return String.valueOf(id);
        return id;

    }

    public void saveRepository(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void updateNote(Note note, String fields, String param) throws Exception {
        switch (fields) {
            case "TITLE":
                note.setTitle(param);
            case "TEXT":
                note.setText(param);
        }
        System.out.println("Заметка обновлена");
        saveOneNote(note);
    }

    @Override
    public void saveOneNote(Note note) throws Exception {
        if (note == null) {
            return;
        }
    }


    public void deleteNote(int userId) throws Exception {
        List<Note> notes = getAllNotes();
        Note foundNote = null;

        for (Note note : notes){
            if (note.getId() == userId){
                foundNote = note;
            }
        }

        if (foundNote != null){
            notes.remove(foundNote);
        } else {
            throw new Exception("note not found");
        }
        saveRepository(notes);
    }
}
