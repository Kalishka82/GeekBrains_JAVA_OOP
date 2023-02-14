/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п., можно
добавить несколько классов), они должны наследоваться от класса Product, надо переопределить
метод toString и попробовать включить эти классы в VendingMachine, вывести список товаров
из VendingMachine
 */
package web_01;

public class Main {
    public static void main(String[] args) {
        WendingMachine store = new WendingMachine();
        store.addProduct(new Product("Lays", 123.45))
        .addProduct(new Product("Lays", 98.79))
                .addProduct(new Product("Fanta", 98.79))
                .addProduct(new Beer("Non-alcohol", 150.20, 0))
                .addProduct(new Beer("Alcohol", 160.80, 6))
                .addProduct(new CursedProducts("Bread", 77.00, 7))
                .addProduct(new Chocolate("MilkChoco", 112.50, 45))
                .addProduct(new Chocolate("DarkChoco", 142.10, 55))
                .addProduct(new MilkProds("Milk", 77.00, 7, 3.5))
                .addProduct(new MilkProds("CottageCheese", 115.25, 4, 9.0));


//        store.printList();
        System.out.println(store);
        System.out.println(store.findProduct("DarkChoco"));

        System.out.println("buying Choco");
        store.buy("DarkChoco", 142.10);
        System.out.println(store);

        System.out.println("buying CottageCheese");
        store.buy("CottageCheese", 115.25);
        System.out.println(store);

        System.out.println(store.findProduct("Lays"));
        System.out.println(store.findProduct("Bread"));

         System.out.println("buying Lay's");
         store.buy("Lays", 123.45);
         System.out.println(store);

         System.out.println("buying Milk");
         store.buy("Milk", 123.45);
         System.out.println(store);

         System.out.println("buying y's");
         store.buy("ys", 123.45);
         System.out.println(store);

         System.out.println("buying Non-Alcohol");
         store.buy("Non-alcohol", 150.20);
         System.out.println(store);
    }
}
