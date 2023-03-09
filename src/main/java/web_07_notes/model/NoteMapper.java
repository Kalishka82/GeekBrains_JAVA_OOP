package web_07_notes.model;

import web_07_notes.views.ViewNote;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class NoteMapper implements Mapper {
    @Override
    public String map(Note note) {
        List<String> maps = Arrays.asList(String.valueOf(note.getId()),
                note.getTitle(),
                note.getText(),
                note.getDate().toString(),
                note.getTime().toString());
        return String.join(ViewNote.divider, maps);
    }

    @Override
    public Note map(String line) {
        String[] lines = line.split("[.,;]");
        return new Note(Integer.parseInt(lines[0]), lines[1], lines[2]
                , LocalDate.parse(lines[3]), LocalTime.parse(lines[4]));
    }
}
