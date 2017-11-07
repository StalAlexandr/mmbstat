package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.TeamDao;
import ru.alexandrstal.mmbstat.dao.UserDao;
import ru.alexandrstal.mmbstat.model.User;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public void save(User user) {
        dao.save(user);
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
