package web_02;

public abstract class Animal implements Sayable {
    public String nikcname;

    public Animal(String nickname) {
        this.nikcname = nickname;
    }

    public abstract String feed();
//    public abstract String say(); //удаляется после создания интерфейса

    @Override
    public String toString() {
        return String.format("My nickname is %s", nikcname);
    }
}
