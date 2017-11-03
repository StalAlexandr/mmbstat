package ru.alexandrstal.mmbstat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("user_birthyear")
    private Integer userBirthYear;

    @JsonProperty("user_city")
    private String userCity;

    @JsonProperty("user_minraidid")
    private Integer userMinRaidId;

    @JsonProperty("user_maxraidid")
    private Integer userMaxRaidId;

    @JsonProperty("user_maxnotstartraidid")
    private Integer userMaxNotStartRaidId;

    @JsonProperty("user_r6")
    private Double userR6;

    @JsonProperty("user_noinvitation")
    private Integer userNoinvitation;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserBirthYear() {
        return userBirthYear;
    }

    public void setUserBirthYear(Integer userBirthYear) {
        this.userBirthYear = userBirthYear;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public Integer getUserMinRaidId() {
        return userMinRaidId;
    }

    public void setUserMinRaidId(Integer userMinRaidId) {
        this.userMinRaidId = userMinRaidId;
    }

    public Integer getUserMaxRaidId() {
        return userMaxRaidId;
    }

    public void setUserMaxRaidId(Integer userMaxRaidId) {
        this.userMaxRaidId = userMaxRaidId;
    }

    public Integer getUserMaxNotStartRaidId() {
        return userMaxNotStartRaidId;
    }

    public void setUserMaxNotStartRaidId(Integer userMaxNotStartRaidId) {
        this.userMaxNotStartRaidId = userMaxNotStartRaidId;
    }

    public Double getUserR6() {
        return userR6;
    }

    public void setUserR6(Double userR6) {
        this.userR6 = userR6;
    }

    public Integer getUserNoinvitation() {
        return userNoinvitation;
    }

    public void setUserNoinvitation(Integer userNoinvitation) {
        this.userNoinvitation = userNoinvitation;
    }
}
