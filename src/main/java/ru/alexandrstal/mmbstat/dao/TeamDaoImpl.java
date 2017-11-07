package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.Team;

/**
 * Created by astal on 04.11.17.
 */
@Repository("teamDao")
public class TeamDaoImpl extends AbstractDao  implements TeamDao {
    @Override
    public void save(Team team) {
        persist(team);
    }
}
