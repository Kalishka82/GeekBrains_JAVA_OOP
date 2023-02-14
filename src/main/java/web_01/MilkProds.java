package web_01;

public class MilkProds extends CursedProducts{
    private Double fattiness;

    public MilkProds(String name, Double price, Integer longevity, Double fattiness) {
        super(name, price, longevity);
        this.fattiness = fattiness;
    }

    @Override
    public String toString() {
        return String.format("%s, жирность = %.1f%%", super.toString(), fattiness);
    }
}
