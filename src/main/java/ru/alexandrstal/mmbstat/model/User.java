package ru.alexandrstal.mmbstat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import java.util.Calendar;
import java.util.Date;

//@Entity(name = "Users")
public class User {

    @JsonProperty("user_id")
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @JsonProperty("user_name")
    @Column(name = "user_name")
    private String userName;

    @JsonProperty("user_birthyear")
    @Column(name = "user_birthyear")
    private Integer userBirthYear;

    @JsonProperty("user_city")
    @Column(name = "user_city")
    private String userCity;

    @JsonProperty("user_registerdt")
    @Column(name = "user_registerdt")
    private Date userRegisterdt = Calendar.getInstance().getTime();


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

    @JsonProperty("user_sex")
    private Integer user_sex;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getUserRegisterdt() {
        return userRegisterdt;
    }

    public void setUserRegisterdt(Date userRegisterdt) {
        this.userRegisterdt = userRegisterdt;
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

    public Integer getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(Integer user_sex) {
        this.user_sex = user_sex;
    }
}
