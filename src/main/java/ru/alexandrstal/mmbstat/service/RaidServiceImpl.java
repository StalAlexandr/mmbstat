package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.LevelDao;
import ru.alexandrstal.mmbstat.dao.RaidDao;
import ru.alexandrstal.mmbstat.model.Raid;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
@Service("raidService")
@Transactional
public class RaidServiceImpl implements RaidService {


    @Autowired
    private RaidDao dao;

    @Override
    public void save(Raid raid) {
        dao.save(raid);
    }

    public RaidDao getDao() {
        return dao;
    }

    public void setDao(RaidDao dao) {
        this.dao = dao;
    }
}
