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
import java.util.Date;

/*
-- Table: public.teams

-- DROP TABLE public.teams;

CREATE TABLE public.teams
(
  team_id integer,
  distance_id integer,
  team_name character varying(255),
  team_num integer,
  team_usegps integer,
  team_greenpeace integer,
  team_result integer,
  team_registerdt date,
  team_outofrange integer,
  team_maxlevelpointorderdone integer,
  team_minlevelpointorderwitherror integer,
  team_dismiss integer,
  invitation_id integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.teams
  OWNER TO postgres;
* */

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
    @Column(name = "team_usegps")
    private Integer teamUseGps;

    @JsonProperty("team_greenpeace")
    @Column(name = "team_greenpeace")
    private Integer teamGreenpeace;

    @JsonProperty("team_result")
    @JsonDeserialize(using=StringDurationDeserializer.class)
    @Column(name = "team_result")
    private Long teamResult;

    @JsonProperty("team_registerdt")
    @Column(name = "team_registerdt")
    private Date teamRegisterdt;

    @JsonProperty("team_outofrange")
    @Column(name = "team_outofrange")
    private Integer teamOutofrange;

    @JsonProperty("team_maxlevelpointorderdone")
    @Column(name = "team_maxlevelpointorderdone")
    private Integer teamMaxlevelpointorderdone;

    @JsonProperty("team_minlevelpointorderwitherror")
    @Column(name = "team_minlevelpointorderwitherror")
    private Integer teamMinlevelpointorderwitherror;

    @JsonProperty("team_dismiss")
    @Column(name = "team_dismiss")
    private Integer teamDismiss;

    @JsonProperty("invitation_id")
    @Column(name = "invitation_id")
    private Integer invitationId;

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

    public void setTeamUseGps(Integer teamUseGps) {
        this.teamUseGps = teamUseGps;
    }

    public void setTeamGreenpeace(Integer teamGreenpeace) {
        this.teamGreenpeace = teamGreenpeace;
    }

    public void setTeamResult(Long teamResult) {
        this.teamResult = teamResult;
    }

    public void setTeamRegisterdt(Date teamRegisterdt) {
        this.teamRegisterdt = teamRegisterdt;
    }

    public void setTeamOutofrange(Integer teamOutofrange) {
        this.teamOutofrange = teamOutofrange;
    }

    public void setTeamMaxlevelpointorderdone(Integer teamMaxlevelpointorderdone) {
        this.teamMaxlevelpointorderdone = teamMaxlevelpointorderdone;
    }

    public void setTeamMinlevelpointorderwitherror(Integer teamMinlevelpointorderwitherror) {
        this.teamMinlevelpointorderwitherror = teamMinlevelpointorderwitherror;
    }

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

    public Integer getTeamUseGps() {
        return teamUseGps;
    }

    public Integer getTeamGreenpeace() {
        return teamGreenpeace;
    }

    public Integer getTeamOutofrange() {
        return teamOutofrange;
    }

    public Long getTeamResult() {
        return teamResult;
    }

    public Date getTeamRegisterdt() {
        return teamRegisterdt;
    }


    public Integer getTeamMaxlevelpointorderdone() {
        return teamMaxlevelpointorderdone;
    }

    public Integer getTeamMinlevelpointorderwitherror() {
        return teamMinlevelpointorderwitherror;
    }

    public Integer getTeamDismiss() {
        return teamDismiss;
    }
    public Integer getInvitationId() {
        return invitationId;
    }

    public void setTeamDismiss(Integer teamDismiss) {
        this.teamDismiss = teamDismiss;
    }

    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }
}
