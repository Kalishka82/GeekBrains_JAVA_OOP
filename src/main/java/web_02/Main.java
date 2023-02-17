/*
Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
Создать интерфейс, скорость плаванья
Добавить новое животное, способное плавать
Все вышеуказанное создать согласно принципам ООП, пройдённым на семинаре
-----------------
Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее. Родитель имеет в себе
общие данные (пример: кличка, количествор лап, какие звуки издают и тд), а наследники собственные
параметры (тип перемещения). Можно сделать дополнительную абстракцию, хищники и травоядные

Создать класс Zoo, и организовать перекличку животных. Теперь создать объект радио, и подумать,
как его включить в объект Zoo.

Организовать интерфейс работы с классами животных (и не только), с методом Speek.

Реорганизовать работу классов с новым интерфейсом.

Продумать, как можно задать животным скорость бега и скорость полета.
 */
package web_02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimal(List.of(new Cat("Barsik"), new Dog("Sharik")
                , new Rabbit("Rodzher"), new Cow("Murka")
                , new Duck("Kryakva"), new Butterfly("Butter")
                , new Dolphin("Dolph")));
//        список всех звуков животных, включая безмолвных (null)
        for (Animal item : zoopark.getAnimals()) {
            System.out.println(item.say());
        }
        System.out.println("--------------");
//        список звуков животных, которые мы можем слышать и воспроизвести - not null, + radio
        for (Sayable item : zoopark.getSayable()) {
            System.out.println(item.say());
        }
        System.out.println("--------------");
//        список животных, способных бегать
        for (Runable item : zoopark.getRunable()) {
            System.out.println(item);
        }
        System.out.println("--------------");
//        список животных, способных летать
        for (Flyable item : zoopark.getFlyable()) {
            System.out.println(item);
        }
        System.out.println("--------------");
//        список животных, способных плавать
        for (Swimable item : zoopark.getSwimable()) {
            System.out.println(item);
        }
        System.out.println("--------------");
//        список самых быстрых животных в своей категории
        System.out.println(zoopark.getRunWin());
        System.out.println(zoopark.getFlyWin());
        System.out.println(zoopark.getSwimWin());
    }
}
