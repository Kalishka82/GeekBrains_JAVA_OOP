package web_05_personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String createUser(User user);
    void deleteUser(String userId) throws Exception;
}
