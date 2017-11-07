package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.DistanceDao;
import ru.alexandrstal.mmbstat.model.Distance;

import javax.transaction.Transactional;

@Service("distanceService")
@Transactional
public class DistanceServiceImpl implements DistanceService{

  //  @Autowired
    private DistanceDao dao;

    @Override
    public void save(Distance distance) {
        dao.save(distance);
    }

    public DistanceDao getDao() {
        return dao;
    }

    public void setDao(DistanceDao dao) {
        this.dao = dao;
    }
}
