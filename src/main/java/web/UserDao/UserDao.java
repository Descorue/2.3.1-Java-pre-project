package web.UserDao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User findUserById(int id);

    void add(User user);

    void deleteUserById(int id);

    void updateUser(User user);


}
