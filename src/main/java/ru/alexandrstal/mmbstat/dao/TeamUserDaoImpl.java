package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.TeamUser;

/**
 * Created by astal on 04.11.17.
 */
//@Repository("teamuserDao")
public class TeamUserDaoImpl extends AbstractDao implements TeamUserDao {
    @Override
    public void save(TeamUser teamUser) {
        persist(teamUser);
    }
}
