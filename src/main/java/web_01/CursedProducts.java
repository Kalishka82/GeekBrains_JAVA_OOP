package web_01;

public class CursedProducts extends Product {
    private final Integer longevity;

    CursedProducts(String name, Double price, Integer longevity) {
        super(name, price);
        this.longevity = longevity;
    }

    @Override
    public String toString() {
        return String.format("%s; срок годности %d дней", super.toString(), longevity);
    }
}
