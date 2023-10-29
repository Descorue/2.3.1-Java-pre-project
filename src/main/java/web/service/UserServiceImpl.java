package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.UserDao.UserDao;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);

    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
