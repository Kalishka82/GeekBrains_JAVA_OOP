package web_05_personal.controllers;

import web_05_personal.model.Repository;
import web_05_personal.model.User;
import web_05_personal.model.ValidateUser;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    private ValidateUser validator = new ValidateUser();

    public void saveUser(User user) throws Exception {
        validator.check(user);
        repository.createUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> readUsers() {
        List<User> users = repository.getAllUsers();
        return users;
    }

    public void deleteUser(String userId) throws Exception {
        repository.deleteUser(userId);
    }
}
