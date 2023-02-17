package web_02;

public class Cow extends Herbivores implements Runable {
    public Cow(String nikcname) {
        super(nikcname);
    }

    @Override
    public String toString() {
        return String.format("I'm cow. I'm running with %dkm/h. %s", speedOfRun(), super.toString());
    }

    @Override
    public String say() {
        return "moo";
    }

    @Override
    public int speedOfRun() {
        return 35;
    }
}
