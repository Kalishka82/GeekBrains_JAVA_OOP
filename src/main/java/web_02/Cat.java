package web_02;

public class Cat extends Predator implements Runable {
    public Cat(String nikcname) {
        super(nikcname);
    }

    @Override
    public String toString() {
        return String.format("I'm cat. I'm running with %dkm/h. %s", speedOfRun(), super.toString());
    }

    @Override
    public String say() {
        return "meow";
    }

    @Override
    public int speedOfRun() {
        return 48;
    }
}
