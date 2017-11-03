package ru.alexandrstal.mmbstat.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ru.alexandrstal.mmbstat.model.parsers.NumericBooleanDeserializer;

import javax.persistence.Entity;

@Entity
public class TeamUser {

    @JsonProperty("teamuser_id")
    private Integer teamuserId;

    @JsonProperty("team_id")
    private Integer teamId;

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("teamuser_rank")
    private Double teamUserRank;

    @JsonProperty("teamuser_new")
    private Integer teamuserNew;

    @JsonProperty("teamuser_notstartraidid")
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    private Boolean teamuserNotStartRaidId;

    public Integer getTeamuserId() {
        return teamuserId;
    }

    public void setTeamuserId(Integer teamuserId) {
        this.teamuserId = teamuserId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getTeamUserRank() {
        return teamUserRank;
    }

    public void setTeamUserRank(Double teamUserRank) {
        this.teamUserRank = teamUserRank;
    }

    public Integer getTeamuserNew() {
        return teamuserNew;
    }

    public void setTeamuserNew(Integer teamuserNew) {
        this.teamuserNew = teamuserNew;
    }

    public Boolean getTeamuserNotStartRaidId() {
        return teamuserNotStartRaidId;
    }

    public void setTeamuserNotStartRaidId(Boolean teamuserNotStartRaidId) {
        this.teamuserNotStartRaidId = teamuserNotStartRaidId;
    }
}
