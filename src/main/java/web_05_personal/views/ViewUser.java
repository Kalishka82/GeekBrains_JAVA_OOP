package web_05_personal.views;

import web_05_personal.controllers.UserController;
import web_05_personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    public static String divider;
    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
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
        String id = prompt("Идентификатор пользователя: ");
        userController.deleteUser(id);
        System.out.printf("user %s deleted\n", id);
    }

    private void caseCreate() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void caseRead() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
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
        List<User> users = userController.readUsers();
        for (User user : users) {
            System.out.println(user);}
    }

    private void caseUpdate() throws Exception {
        String id = prompt("Идентификатор пользователя: "); //в процессе будет
                                //изменен вместе с изменением данных пользователя
        try {
            User user = userController.readUser(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        userController.deleteUser(id);
        dividerChoice();
        caseCreate();
    }
}
