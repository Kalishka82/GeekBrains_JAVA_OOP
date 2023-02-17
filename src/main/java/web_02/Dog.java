package web_02;

public class Dog extends Predator implements Runable, Swimable {
    public Dog(String nikcname) {
        super(nikcname);
    }

    @Override
    public String toString() {
        return String.format("I'm dog. I'm running with %dkm/h, swimming with %dkm/h. %s"
                , speedOfRun(), speedOfSwim(), super.toString());
    }

    @Override
    public String say() {
        return "woof";
    }

    @Override
    public int speedOfRun() {
        return 58;
    }

    @Override
    public int speedOfSwim() {
        return 2;
    }
}
