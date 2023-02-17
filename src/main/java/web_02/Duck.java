package web_02;

public class Duck extends Herbivores implements Runable, Flyable, Swimable {
    public Duck(String nikcname) {
        super(nikcname);
    }

    @Override
    public int speedOfRun() {
        return 2;
    }

    @Override
    public String say() {
        return "quack";
    }

    @Override
    public int speedOfFly() {
        return 90;
    }

    @Override
    public String toString() {
        return String.format("I'm duck. I'm running with %dkm/h" +
                        ", flying with %dkm/h, swimming with %dkm/h. %s"
                , speedOfRun(), speedOfFly(), speedOfSwim(), super.toString());
    }

    @Override
    public int speedOfSwim() {
        return 4;
    }
}
