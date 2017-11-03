package ru.alexandrstal.mmbstat.model;

/*
* */

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;

@Entity
public class Raid {

    @JsonProperty("raid_id")
    private Integer raidId;

    @JsonProperty("raid_name")
    private String raidName;

    public Integer getRaidId() {
        return raidId;
    }

    public void setRaidId(Integer raidId) {
        this.raidId = raidId;
    }

    public String getRaidName() {
        return raidName;
    }

    public void setRaidName(String raidName) {
        this.raidName = raidName;
    }
}
