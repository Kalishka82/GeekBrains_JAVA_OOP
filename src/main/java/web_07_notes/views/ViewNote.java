package web_07_notes.views;


import web_07_notes.controller.NoteController;
import web_07_notes.model.Note;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class ViewNote {

    public static String divider;
    private NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        dividerChoice();
                        caseCreate();
                        break;
                    case READ:
                        caseRead();
                        break;
                    case LIST:
                        caseList();
                        break;
                    case UPDATE:
                        caseUpdate();
                        break;
                    case DELETE:
                        caseDelete();
                        break;
                }
            } catch (Exception e) {
                System.out.printf("Error: %s \n", e.getMessage());
            }
        }
    }

    public String dividerChoice() {
        divider = prompt("Выбор вида записи: 1 - через точку с запятой" +
                ", 2 - через точку" +
                ", enter = default - через запятую ");
        switch (divider) {
            case "1":
                divider = ";";
                break;
            case "2":
                divider = ".";
                break;
            default:
                divider = ",";
                break;
        }
        return divider;
    }

    private void caseDelete() throws Exception{
        int id = Integer.parseInt(prompt("Номер заметки: "));
        noteController.deleteNote(id);
        System.out.printf("note %s deleted\n", id);
    }

    private void caseCreate() throws Exception {
        String title = prompt("Название заметки: ");
        String note = prompt("Текст заметки: ");
        noteController.saveNote(new Note(title, note, LocalDate.now(), LocalTime.now()));
    }

    private void caseRead() {
        int id = Integer.parseInt(prompt("Номер заметки: "));
        try {
            Note note = noteController.readNote(id);
            System.out.println(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private void caseList() {
        List<Note> notes = noteController.getNotes();
        for (Note note : notes) {
            System.out.println(note);}
    }

    private void caseUpdate() throws Exception {
        int id = Integer.parseInt(prompt("Номер заметки: "));//в процессе будет
                                //изменен вместе с изменением названия или текста в заметке
        try {
            Note note = noteController.readNote(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        noteController.deleteNote(id);
        dividerChoice();
        caseCreate();
    }
}
