package ru.alexandrstal.mmbstat.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Distance {

    @JsonProperty("distance_id")
    private Integer distanceId;

    @JsonProperty("raid_id")
    private Integer raidId;

    @JsonProperty("distance_name")
    private String distanceName;

    public Integer getDistanceId() {
        return distanceId;
    }

    public void setDistanceId(Integer distanceId) {
        this.distanceId = distanceId;
    }

    public String getDistanceName() {
        return distanceName;
    }

    public void setDistanceName(String distanceName) {
        this.distanceName = distanceName;
    }

    public Integer getRaidId() {
        return raidId;
    }

    public void setRaidId(Integer raidId) {
        this.raidId = raidId;
    }
}
