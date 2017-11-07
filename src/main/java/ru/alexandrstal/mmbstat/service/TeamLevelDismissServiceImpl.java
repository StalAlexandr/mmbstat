package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.RaidDao;
import ru.alexandrstal.mmbstat.dao.TeamLevelDismissDao;
import ru.alexandrstal.mmbstat.model.TeamLevelDismiss;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
@Service("teamleveldismissService")
@Transactional
public class TeamLevelDismissServiceImpl implements TeamLevelDismissService {

 //   @Autowired
    private TeamLevelDismissDao dao;

    @Override
    public void save(TeamLevelDismiss teamLevelDismiss) {
        dao.save(teamLevelDismiss);
    }

    public TeamLevelDismissDao getDao() {
        return dao;
    }

    public void setDao(TeamLevelDismissDao dao) {
        this.dao = dao;
    }
}
