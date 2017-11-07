package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.Raid;

/**
 * Created by astal on 04.11.17.
 */
@Repository("raidDao")
public class RaidDaoImpl extends AbstractDao implements RaidDao {
    @Override
    public void save(Raid raid) {
        persist(raid);
    }
}
