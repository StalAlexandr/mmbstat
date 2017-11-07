package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.TeamUser;
import ru.alexandrstal.mmbstat.model.User;

/**
 * Created by astal on 04.11.17.
 */
public interface UserDao {
    void save(User user);
}
