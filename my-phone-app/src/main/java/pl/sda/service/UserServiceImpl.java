package pl.sda.service;


import pl.sda.dao.UserDao;
import pl.sda.dao.UserDaoImpl;
import pl.sda.model.User;

import static pl.sda.mapper.UserMapper.mapToUser;
import static pl.sda.mapper.UserMapper.mapToUserEntity;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void saveUser(User user) {
        userDao.saveUser(mapToUserEntity(user));
    }

    @Override
    public User getUser(String login) {
        return mapToUser(userDao.findUser(login).orElse(null));
    }
}
