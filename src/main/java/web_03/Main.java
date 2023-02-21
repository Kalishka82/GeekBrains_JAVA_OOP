/*
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
Реализовать класс User, с полями firstName, lastName, age, переопределить метод toString()
Создать класс Personal, реализовать интерфейс Iterable<User>
В классе Main создать список пользователей, добавить его в класс Personal,
при помощи foreach, задействуя класс Personal, вывести каждого пользователя

В классе User реализовать интерфейс Comparable<User>, сравнивать по возрасту
В классе Main отсортировать список пользователей по возрасту (применяя Comparable<User>

Создать поле списка подчиненных в классе User, в качестве списка подчиненных использовать
класс Personal
Создать класс Company, реализовать в нем интерфейс Iterable<User>. Передать в класс Company
класс User (в конструкторе, или через метод), у которого есть подчиненные
Организовать итератор в классе Company, реализуя вывод всех подчиненных пользователей,
можно использовать поиск в глубину, чтобы найти всех подчиненных у подчиненных
В классе Main проверить вывод всех пользователей компании
 */
package web_03;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Petr", "Petrov", 58);
        User user2 = new User("Ivan", "Ivanov", 34);
        User user3 = new User("Anna", "Anina", 44);
        User user4 = new User("Alex", "Bredov", 18);
        User user5 = new User("Anna", "Anina", 25);

        Personal personal = new Personal(List.of(user1, user2, user3, user4, user5));
//        for (User user : personal) {
//            System.out.println(user);
//        }

        List<User> users = personal.toList();

        Collections.sort(users);
//        for (User user: users) {
//            System.out.println(user);
//        }

        User boss = new User("Will", "Smith", 50);
        User cto = new User("Bill", "White", 36);
        User ceo = new User("Joe", "Black", 39);
        User manager1 = new User ("Jane", "Air", 28);
        User manager2 = new User("Bella", "Green", 30);
        User manager3 = new User("Alex", "Bright", 20);

        Personal managers1 = new Personal(List.of(manager1, manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(cto, ceo));
        boss.setPersonal(chiefs);
        cto.setPersonal(managers1);
        ceo.setPersonal(managers2);

        Company company = new Company(boss);
        for (User user : company) {
            System.out.println(user);
        }
    }
}
