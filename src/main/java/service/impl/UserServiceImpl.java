package service.impl;

import dao.UserDao;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import service.UserService;

@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
