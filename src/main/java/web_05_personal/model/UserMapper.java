package web_05_personal.model;

import web_05_personal.views.ViewUser;

import java.util.Arrays;
import java.util.List;

public class UserMapper implements Mapper {
    @Override
    public String map(User user) {
        List<String> maps = Arrays.asList(user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        return String.join(ViewUser.divider, maps);
    }

    @Override
    public User map(String line) {
        String[] lines = line.split("[.,:;]");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
