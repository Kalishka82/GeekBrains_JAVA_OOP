package web_02;

public abstract class Predator extends Animal {

    public Predator(String nikcname) {
        super(nikcname);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
