package web_05_personal.model;

public interface Mapper {
    public String map(User user);
    public User map(String line);
}
