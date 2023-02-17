package web_02;

public class Rabbit extends Herbivores implements Runable{
    public Rabbit(String nikcname) {
        super(nikcname);
    }

    @Override
    public String toString() {
        return String.format("I'm rabbit. I'm running with %dkm/h. %s", speedOfRun(), super.toString());
    }

    @Override
    public String say() {
        return null;
    }

    @Override
    public int speedOfRun() {
        return 40;
    }
}
