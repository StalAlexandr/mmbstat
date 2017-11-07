package ru.alexandrstal.mmbstat.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Entity(name="Distances")
public class Distance {

    @JsonProperty("distance_id")
    @Id
    @Column(name = "distance_id")
    private Integer distanceId;

    @JsonProperty("raid_id")
    @Column(name = "raid_id")
    private Integer raidId;

    @JsonProperty("distance_name")
    @Column(name = "distance_name")
    private String distanceName;

    @JsonProperty("distance_data")
    @Column(name = "distance_data")
    private Date distanceData;

    @JsonProperty("distance_resultlink")
    @Column(name = "distance_resultlink")
    private String distanceResultLink="";

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

    public Date getDistanceData() {
        return distanceData;
    }

    public void setDistanceData(Date distanceData) {
        this.distanceData = distanceData;
    }

    public String getDistanceResultLink() {
        return distanceResultLink;
    }

    public void setDistanceResultLink(String distanceResultLink) {
        this.distanceResultLink = distanceResultLink;
    }
}
