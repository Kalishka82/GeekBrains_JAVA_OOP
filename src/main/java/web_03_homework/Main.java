/*Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable
интерфейс. Список должен содержать элементы со ссылкой на следующий элемент (если показалось
мало, то реализовать ссылку и на предыдущий элемент)
 */
package web_03_homework;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.addByIndex(2, "data2-1");
        list.add("data4");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("------");

        list.removeByIndex(2);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
