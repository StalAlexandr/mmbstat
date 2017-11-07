package ru.alexandrstal.mmbstat.dao;

import org.springframework.stereotype.Repository;
import ru.alexandrstal.mmbstat.model.Invitation;

/**
 * Created by astal on 04.11.17.
 */
//@Repository("invitationDao")
public class InvitationDaoImpl extends AbstractDao implements InvitationDao {
    @Override
    public void save(Invitation invitation) {
        persist(invitation);
    }
}
