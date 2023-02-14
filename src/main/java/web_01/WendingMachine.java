package web_01;

import java.util.ArrayList;
import java.util.List;

public class WendingMachine {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public double getMoney() {
        return money;
    }

    private double money;

    public WendingMachine addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public Product findProduct(String name) {
        for (Product prod : getProducts()) {
            if (prod.getName().equals(name)) {
                return prod;
            }
        }
        return null;
    }

    public Product buy(String name, Double price) {
        Product something = findProduct(name);
        if (something == null) return null;
        else if (price.equals(something.getPrice())) {
            products.remove(something);
            money += price;
            return something;
        }
        System.out.println("price is wrong");
        return null;
    }

    public void printList() {
        for (Product prod : getProducts()) {
            System.out.println(prod);
        }
    }

    public String toString() {
        StringBuilder wdProducts = new StringBuilder();
        for (Product prod : this.getProducts()) {
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(money);
        return wdProducts.toString();
    }
}
