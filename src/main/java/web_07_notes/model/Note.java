package web_07_notes.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Note {
    private int id;
    private String title;
    private String text;
    public LocalDate date;
    public LocalTime time;

    public Note(String title, String text, LocalDate date, LocalTime time) {
        this.title = title;
        this.text = text;
        this.date = date;
        this.time = time;
    }

    public Note(int id, String title, String text, LocalDate date, LocalTime time) {
        this(title, text);
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %tF, %tR"
                , id, title, text, date, time);
    }
}
