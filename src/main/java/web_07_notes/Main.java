/*
Урок 7. ООП Дизайн и Solid
Написать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки,
создать одну записку, отредактировать записку, удалить, и прочитать одну записку по ID), записка
содержит в себе как минимум 3 поля Id, заголовок и текст, можно добавить дату.
Хранение по вашему выбору, можно в текстовом файле (или каждая записка в одном файле, как вам удобнее).
 */
package web_07_notes;

import web_07_notes.controller.NoteController;
import web_07_notes.model.*;
import web_07_notes.views.ViewNote;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/web_07_notes/notes.txt");
        Repository repository = new RepositoryFile(fileOperation, new NoteMapper());
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
