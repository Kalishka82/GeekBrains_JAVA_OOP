package web_02;

public abstract class Herbivores extends Animal {
    public Herbivores(String nikcname) {
        super(nikcname);
    }

    @Override
    public String feed() {
        return "grass";
    }
}
