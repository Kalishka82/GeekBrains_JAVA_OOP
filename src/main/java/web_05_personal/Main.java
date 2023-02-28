/*
Урок 5. От простого к практике
Доработать справочник пользователей, для изменения пользователя. Поработать над проектом.
Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой,
и разделителем - пустой строкой. Предусмотреть сохранение в старом формате.

(*) Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования
(*) - Дополнительно
 */
package web_05_personal;

import web_05_personal.controllers.UserController;
import web_05_personal.model.*;
import web_05_personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/web_05_personal/users.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
