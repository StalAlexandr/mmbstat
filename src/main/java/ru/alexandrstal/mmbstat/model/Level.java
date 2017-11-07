package ru.alexandrstal.mmbstat.model;

//{"levelpoint_id":"1755","distance_id":"37","levelpoint_name":"3","levelpoint_order":"4","pointtype_id":"5","levelpoint_penalty":"40","levelpoint_mindatetime":"0000-00-00 00:00:00","levelpoint_maxdatetime":"0000-00-00 00:00:00","scanpoint_id":"0"},

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="Levels")
public class Level {

    @JsonProperty("levelpoint_id")
    @Id
    @Column(name = "levelpoint_id")
    private Integer levelpointId;

    @JsonProperty("distance_id")
    @Column(name = "distance_id")
    private Integer distanceId;

    @JsonProperty("levelpoint_name")
    @Column(name = "levelpoint_name")
    private String levelpointName;

    @JsonProperty("levelpoint_order")
    @Column(name = "levelpoint_order")
    private Integer levelpointOrder;

    @JsonProperty("pointtype_id")
    @Column(name = "pointtype_id")
    private Integer pointtypeId;

    @JsonProperty("levelpoint_penalty")
    @Column(name = "levelpoint_penalty")
    private Integer levelpointPenalty;

    @JsonProperty("levelpoint_mindatetime")
    @Column(name = "levelpoint_mindatetime")
    private Date levelpointMinDatetime;

    @JsonProperty("levelpoint_maxdatetime")
    @Column(name = "levelpoint_maxdatetime")
    private Date levelpointMaxDatetime;

    @JsonProperty("scanpoint_id")
    @Column(name = "scanpoint_id")
    private Integer scanpointId;

    public Integer getLevelpointId() {
        return levelpointId;
    }

    public void setLevelpointId(Integer levelpointId) {
        this.levelpointId = levelpointId;
    }

    public Integer getDistanceId() {
        return distanceId;
    }

    public void setDistanceId(Integer distanceId) {
        this.distanceId = distanceId;
    }

    public String getLevelpointName() {
        return levelpointName;
    }

    public void setLevelpointName(String levelpointName) {
        this.levelpointName = levelpointName;
    }

    public Integer getLevelpointOrder() {
        return levelpointOrder;
    }

    public void setLevelpointOrder(Integer levelpointOrder) {
        this.levelpointOrder = levelpointOrder;
    }

    public Integer getPointtypeId() {
        return pointtypeId;
    }

    public void setPointtypeId(Integer pointtypeId) {
        this.pointtypeId = pointtypeId;
    }

    public Integer getLevelpointPenalty() {
        return levelpointPenalty;
    }

    public void setLevelpointPenalty(Integer levelpointPenalty) {
        this.levelpointPenalty = levelpointPenalty;
    }

    public Date getLevelpointMinDatetime() {
        return levelpointMinDatetime;
    }

    public void setLevelpointMinDatetime(Date levelpointMinDatetime) {
        this.levelpointMinDatetime = levelpointMinDatetime;
    }

    public Date getLevelpointMaxDatetime() {
        return levelpointMaxDatetime;
    }

    public void setLevelpointMaxDatetime(Date levelpointMaxDatetime) {
        this.levelpointMaxDatetime = levelpointMaxDatetime;
    }

    public Integer getScanpointId() {
        return scanpointId;
    }

    public void setScanpointId(Integer scanpointId) {
        this.scanpointId = scanpointId;
    }
}
