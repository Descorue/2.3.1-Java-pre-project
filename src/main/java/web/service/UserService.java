package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();
    User findUserById(int id);

    void deleteUserById(int id);
    void updateUser(User user);

    void add(User user);
}
