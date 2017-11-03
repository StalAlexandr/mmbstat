package ru.alexandrstal.mmbstat.model;

//{"teamleveldismiss_id":"2584","levelpoint_id":"1752","teamleveldismiss_date":"2017-10-28 12:13:00","teamuser_id":"36029"},

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class TeamLevelDismiss {

    @JsonProperty("teamleveldismiss_id")
    private Integer teamLevelDismissId;

    @JsonProperty("levelpoint_id")
    private Integer levelPointId;

    @JsonProperty("teamleveldismiss_date")
    private Date teamLevelDismissDate;

    @JsonProperty("teamuser_id")
    private Integer teamuserId;

    public Integer getTeamLevelDismissId() {
        return teamLevelDismissId;
    }

    public void setTeamLevelDismissId(Integer teamLevelDismissId) {
        this.teamLevelDismissId = teamLevelDismissId;
    }

    public Integer getLevelPointId() {
        return levelPointId;
    }

    public void setLevelPointId(Integer levelPointId) {
        this.levelPointId = levelPointId;
    }

    public Date getTeamLevelDismissDate() {
        return teamLevelDismissDate;
    }

    public void setTeamLevelDismissDate(Date teamLevelDismissDate) {
        this.teamLevelDismissDate = teamLevelDismissDate;
    }

    public Integer getTeamuserId() {
        return teamuserId;
    }

    public void setTeamuserId(Integer teamuserId) {
        this.teamuserId = teamuserId;
    }
}
