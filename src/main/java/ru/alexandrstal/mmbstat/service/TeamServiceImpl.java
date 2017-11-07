package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.TeamDao;
import ru.alexandrstal.mmbstat.dao.TeamLevelDismissDao;
import ru.alexandrstal.mmbstat.model.Team;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
@Service("teamService")
@Transactional
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao dao;

    @Override
    public void save(Team team) {
        dao.save(team);
    }

    public TeamDao getDao() {
        return dao;
    }

    public void setDao(TeamDao dao) {
        this.dao = dao;
    }
}
