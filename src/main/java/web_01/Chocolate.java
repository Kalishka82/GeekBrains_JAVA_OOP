package web_01;

public class Chocolate extends Product {
    private final Integer cocoa;

    public Chocolate(String name, Double price, Integer cocoa) {
        super(name, price);
        this.cocoa = cocoa;
    }

    @Override
    public String toString() {
        return String.format("%s, содержание какао = %d%%", super.toString(), cocoa);
    }
}
