package ru.alexandrstal.mmbstat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ru.alexandrstal.mmbstat.model.parsers.NumericBooleanDeserializer;
import ru.alexandrstal.mmbstat.model.parsers.StringDurationDeserializer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Teams")
public class Team {



    @JsonProperty("team_id")
    @Id
    @Column(name = "team_id")
    private Integer teamId;

    @JsonProperty("distance_id")
    @Column(name = "distance_id")
    private Integer distanceId;

    @JsonProperty("team_name")
    @Column(name = "team_name")
    private String teamName;

    @JsonProperty("team_num")
    @Column(name = "team_num")
    private Integer teamNum;

    @JsonProperty("team_usegps")
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    @Column(name = "team_usegps")
    private boolean teamUseGps;

    @JsonProperty("team_greenpeace")
    @Column(name = "team_greenpeace")
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    private boolean teamGreenpeace;

    @JsonProperty("team_result")
    @JsonDeserialize(using=StringDurationDeserializer.class)
    @Column(name = "team_result")
    private Long teamResult;

    @JsonProperty("team_registerdt")
    @Column(name = "team_registerdt")
    private String teamRegisterdt;

    @JsonProperty("team_outofrange")
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    @Column(name = "team_outofrange")
    private boolean teamOutofrange;

    @JsonProperty("team_maxlevelpointorderdone")
    @Column(name = "team_maxlevelpointorderdone")
    private Integer teamMaxlevelpointorderdone;

    @JsonProperty("team_minlevelpointorderwitherror")
    @Column(name = "team_minlevelpointorderwitherror")
    private Integer teamMinlevelpointorderwitherror;

    /*

    @JsonProperty("team_dismiss")
    @Column(name = "team_dismiss")
    private Integer teamDismiss;

    @JsonProperty("invitation_id")
    @Column(name = "invitation_id")
    private Integer invitationId;
*/
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public void setDistanceId(Integer distanceId) {
        this.distanceId = distanceId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamNum(Integer teamNum) {
        this.teamNum = teamNum;
    }

    public void setTeamUseGps(boolean teamUseGps) {
        this.teamUseGps = teamUseGps;
    }

    public void setTeamGreenpeace(boolean teamGreenpeace) {
        this.teamGreenpeace = teamGreenpeace;
    }

    public void setTeamResult(Long teamResult) {
        this.teamResult = teamResult;
    }

    public void setTeamRegisterdt(String teamRegisterdt) {
        this.teamRegisterdt = teamRegisterdt;
    }

    public void setTeamOutofrange(boolean teamOutofrange) {
        this.teamOutofrange = teamOutofrange;
    }

    public void setTeamMaxlevelpointorderdone(Integer teamMaxlevelpointorderdone) {
        this.teamMaxlevelpointorderdone = teamMaxlevelpointorderdone;
    }

    public void setTeamMinlevelpointorderwitherror(Integer teamMinlevelpointorderwitherror) {
        this.teamMinlevelpointorderwitherror = teamMinlevelpointorderwitherror;
    }
/*

    public void setTeamDismiss(Integer teamDismiss) {
        this.teamDismiss = teamDismiss;
    }
    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }
*/

    public Integer getTeamId() {
        return teamId;
    }

    public Integer getDistanceId() {
        return distanceId;
    }

    public String getTeamName() {
        return teamName;
    }

    public Integer getTeamNum() {
        return teamNum;
    }

    public boolean isTeamUseGps() {
        return teamUseGps;
    }

    public boolean isTeamGreenpeace() {
        return teamGreenpeace;
    }

    public Long getTeamResult() {
        return teamResult;
    }

    public String getTeamRegisterdt() {
        return teamRegisterdt;
    }

    public boolean isTeamOutofrange() {
        return teamOutofrange;
    }

    public Integer getTeamMaxlevelpointorderdone() {
        return teamMaxlevelpointorderdone;
    }

    public Integer getTeamMinlevelpointorderwitherror() {
        return teamMinlevelpointorderwitherror;
    }
/*

    public Integer getTeamDismiss() {
        return teamDismiss;
    }
    public Integer getInvitationId() {
        return invitationId;
    }
    */
}
