package web_02;

public class Butterfly extends Herbivores implements Flyable {
    public Butterfly(String nikcname) {
        super(nikcname);
    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    @Override
    public String say() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("I'm butterfly. I'm flying with %dkm/h. %s"
                , speedOfFly(), super.toString());
    }
}
