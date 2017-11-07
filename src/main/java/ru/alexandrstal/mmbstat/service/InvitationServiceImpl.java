package ru.alexandrstal.mmbstat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrstal.mmbstat.dao.InvitationDao;
import ru.alexandrstal.mmbstat.model.Invitation;

import javax.transaction.Transactional;

/**
 * Created by astal on 04.11.17.
 */
@Service("invitationService")
@Transactional
public class InvitationServiceImpl implements InvitationService {

    @Autowired
    private InvitationDao dao;

    @Override
    public void save(Invitation invitation) {
        dao.save(invitation);
    }

    public InvitationDao getDao() {
        return dao;
    }

    public void setDao(InvitationDao dao) {
        this.dao = dao;
    }
}
