package ru.alexandrstal.mmbstat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="Invitations")
public class Invitation {


    @JsonProperty("invitation_id")
    @Id
    @Column(name = "invitation_id")
    private Integer invitationId;

    @JsonProperty("invitation_begindt")
    @Column(name = "invitation_begindt")
    private Date invitationBegindt;

    @JsonProperty("invitation_enddt")
    @Column(name = "invitation_enddt")
    private Date invitation_enddt;

    @JsonProperty("user_id")
    @Column(name = "user_id")
    private Integer userId;

    @JsonProperty("invitationdelivery_type")
    @Column(name = "invitationdelivery_type")
    private Integer invitationdeliveryType;

    public Integer getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }

    public Date getInvitationBegindt() {
        return invitationBegindt;
    }

    public void setInvitationBegindt(Date invitationBegindt) {
        this.invitationBegindt = invitationBegindt;
    }

    public Date getInvitation_enddt() {
        return invitation_enddt;
    }

    public void setInvitation_enddt(Date invitation_enddt) {
        this.invitation_enddt = invitation_enddt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getInvitationdeliveryType() {
        return invitationdeliveryType;
    }

    public void setInvitationdeliveryType(Integer invitationdeliveryType) {
        this.invitationdeliveryType = invitationdeliveryType;
    }
}
