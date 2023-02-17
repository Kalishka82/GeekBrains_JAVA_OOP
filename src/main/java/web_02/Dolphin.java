package web_02;

public class Dolphin extends Predator implements Swimable {
    public Dolphin(String nikcname) {
        super(nikcname);
    }

    @Override
    public String say() {
        return null;
    }

    @Override
    public int speedOfSwim() {
        return 45;
    }

    @Override
    public String toString() {
        return String.format("I'm dolphin. I'm swimming with %dkm/h. %s"
                , speedOfSwim(), super.toString());
    }
}
