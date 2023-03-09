# JAVA: Объектно-ориентированное программирование (семинары)  

### web_01:
        На основе кода с урока добавить еще один класс продукта (молоко, шоколад и т.п.,  
        можно добавить несколько классов), они должны наследоваться от класса Product,  
        надо переопределить метод toString и попробовать включить эти классы в VendingMachine,  
        вывести список товаров из VendingMachine

### web_02:
        Создать интерфейс скорость плаванья  
        Добавить новое животное, способное плавать  
        Все вышеуказанное создать согласно принципам ООП, пройдённым на семинаре

### web_03:
        Реализовать класс User, с полями firstName, lastName, age, переопределить метод toString()
        Создать класс Personal, реализовать интерфейс Iterable<User>
        В классе Main создать список пользователей, добавить его в класс Personal, при помощи foreach, задействуя класс Personal, вывести каждого пользователя
        В классе User реализовать интерфейс Comparable<User>, сравнивать по возрасту
        В классе Main отсортировать список пользователей по возрасту (применяя Comparable<User>
        Создать поле списка подчиненных в классе User, в качестве списка подчиненных использовать класс Personal
        Создать класс Company, реализовать в нем интерфейс Iterable<User>. Передать в класс Company класс User (в конструкторе, или через метод), у которого есть подчиненные
        Организовать итератор в классе Company, реализуя вывод всех подчиненных пользователей, можно использовать поиск в глубину, чтобы найти всех подчиненных у подчиненных
        В классе Main проверить вывод всех пользователей компании

### web_03_homework:
        Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем 
        iterable интерфейс. Список должен содержать элементы со ссылкой на следующий элемент 
        (если показалось мало, то реализовать ссылку и на предыдущий элемент)

### web_04/Game: 
        На основе работы на уроке.
        Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors
        обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
        Добавить метод определения минимального щита в команде.
        * Продумать, как можно сделать воина без щита.

### web_05_personal:
        На основе работы на уроке.  
        Доработать справочник пользователей, для изменения пользователя. Поработать над проектом.
        Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой, 
        и разделителем - пустой строкой. 
        Предусмотреть сохранение в старом формате.

### web_06_HomeWork:
        Реструктуризировать проект HomeWork с учетом теоретических основ SOLID’а

### web_07_Notes:
        Написать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки, создать одну записку, отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как минимум 3 поля Id, заголовок и текст, можно добавить дату.
        Хранение по вашему выбору, можно в текстовом файле (или каждая записка в одном файле, как вам удобнее). 