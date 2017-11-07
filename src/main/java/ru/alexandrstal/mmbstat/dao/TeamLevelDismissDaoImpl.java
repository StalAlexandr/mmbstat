package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.TeamLevelDismiss;

/**
 * Created by astal on 04.11.17.
 */
//@Repository("teamleveldismissDao")
public class TeamLevelDismissDaoImpl extends AbstractDao implements TeamLevelDismissDao {
    @Override
    public void save(TeamLevelDismiss teamLevelDismiss) {
        persist(teamLevelDismiss);
    }
}
