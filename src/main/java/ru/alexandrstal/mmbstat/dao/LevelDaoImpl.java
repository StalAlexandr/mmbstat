package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.Level;

/**
 * Created by astal on 04.11.17.
 */
@Repository("levelDao")
public class LevelDaoImpl extends AbstractDao implements LevelDao {
    @Override
    public void save(Level level) {
        persist(level);
    }
}
