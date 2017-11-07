package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.Distance;

@Repository("distanceDao")
public class DistanceDaoImpl extends AbstractDao implements DistanceDao  {
    @Override
    public void save(Distance distance) {
       persist(distance);
    }
}
