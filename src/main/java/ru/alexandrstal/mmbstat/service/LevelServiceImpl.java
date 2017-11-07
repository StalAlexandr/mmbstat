package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.InvitationDao;
import ru.alexandrstal.mmbstat.dao.LevelDao;
import ru.alexandrstal.mmbstat.model.Level;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
@Service("levelService")
@Transactional
public class LevelServiceImpl implements LevelService {

    @Autowired
    private LevelDao dao;

    @Override
    public void save(Level level) {
        dao.save(level);
    }

    public LevelDao getDao() {
        return dao;
    }

    public void setDao(LevelDao dao) {
        this.dao = dao;
    }
}
