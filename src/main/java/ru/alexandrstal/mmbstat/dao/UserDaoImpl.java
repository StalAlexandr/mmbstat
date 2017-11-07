package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.User;

/**
 * Created by astal on 04.11.17.
 */
//@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {
    @Override
    public void save(User user) {
         persist(user);
    }
}
