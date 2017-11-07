package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.TeamLevelDismiss;
import ru.alexandrstal.mmbstat.model.TeamUser;

/**
 * Created by astal on 04.11.17.
 */
public interface TeamUserDao {
    void save(TeamUser teamUser);
}
