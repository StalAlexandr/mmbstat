package ru.alexandrstal.mmbstat.service;

import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.model.TeamLevelDismiss;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
public interface TeamLevelDismissService {
    void save(TeamLevelDismiss teamLevelDismiss);
}
