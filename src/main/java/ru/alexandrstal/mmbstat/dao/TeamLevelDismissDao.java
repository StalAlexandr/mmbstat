package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.Team;
import ru.alexandrstal.mmbstat.model.TeamLevelDismiss;

/**
 * Created by astal on 04.11.17.
 */
public interface TeamLevelDismissDao {
    void save(TeamLevelDismiss teamLevelDismiss);
}
