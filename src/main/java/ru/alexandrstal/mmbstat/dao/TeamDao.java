package ru.alexandrstal.mmbstat.dao;

import ru.alexandrstal.mmbstat.model.Raid;
import ru.alexandrstal.mmbstat.model.Team;

/**
 * Created by astal on 04.11.17.
 */
public interface TeamDao {
    void save(Team team);
}
