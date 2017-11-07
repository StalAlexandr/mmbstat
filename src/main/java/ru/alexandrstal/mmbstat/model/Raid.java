package ru.alexandrstal.mmbstat.model;

/*
* */

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="Raids")
public class Raid {

    @JsonProperty("raid_id")
    @Id
    @Column(name = "raid_id")
    private Integer raidId;

    @JsonProperty("raid_name")
    @Column(name = "raid_name")
    private String raidName;

    @JsonProperty("raid_period")
    @Column(name = "raid_period")
    private String raidPeriod="";

    @JsonProperty("raid_logolink")
    @Column(name = "raid_logolink")
    private String raidLogolink="";

    @JsonProperty("raid_znlink")
    @Column(name = "raid_znlink")
    private String raidZnlink="";

    @JsonProperty("raid_kpwptlink")
    @Column(name = "raid_kpwptlink")
    private String raidKpwptlink="";

    @JsonProperty("raid_startpoint")
    @Column(name = "raid_startpoint")
    private String raidStartpoint="";

    @JsonProperty("raid_finishpoint")
    @Column(name = "raid_finishpoint")
    private String raidFinishpoint ="";

    @JsonProperty("raid_ruleslink")
    @Column(name = "raid_ruleslink")
    private String raidRuleslink="";

    @JsonProperty("raid_startlink")
    @Column(name = "raid_startlink")
    private String raidStartlink="";

    @JsonProperty("raid_folder")
    @Column(name = "raid_folder")
    private String raidFolder="";

    @JsonProperty("raid_registrationenddate")
    @Column(name = "raid_registrationenddate")
    private Date raidRegistrationenddate;

    @JsonProperty("raid_closedate")
    @Column(name = "raid_closedate")
    private Date raidClosedate;

    @JsonProperty("raid_legendlink")
    @Column(name = "raid_legendlink")
    private String raidLegendlink="";

    @JsonProperty("raid_ziplink")
    @Column(name = "raid_ziplink")
    private String raidZiplink="";

    @JsonProperty("raid_noshowresult")
    @Column(name = "raid_noshowresult")
    private Integer raidNoshowresult=0;

    @JsonProperty("raid_fileprefix")
    @Column(name = "raid_fileprefix")
    private String raidFileprefix="";

    @JsonProperty("raid_readonlyhoursbeforestart")
    @Column(name = "raid_readonlyhoursbeforestart")
    private Integer raidReadonlyhoursbeforestart=1;

    @JsonProperty("raid_mapprice")
    @Column(name = "raid_mapprice")
    private Integer raidMapprice=0;

    @JsonProperty("raid_notstartfee")
    @Column(name = "raid_notstartfee")
    private Integer raidNotstartfee=0;

    @JsonProperty("raid_nostartprice")
    @Column(name = "raid_nostartprice")
    private Integer raidNostartprice=0;

    @JsonProperty("raid_teamslimit")
    @Column(name = "raid_teamslimit")
    private Integer raidTeamslimit=1000;

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

    public String getRaidPeriod() {
        return raidPeriod;
    }

    public void setRaidPeriod(String raidPeriod) {
        this.raidPeriod = raidPeriod;
    }

    public String getRaidLogolink() {
        return raidLogolink;
    }

    public void setRaidLogolink(String raidLogolink) {
        this.raidLogolink = raidLogolink;
    }

    public String getRaidZnlink() {
        return raidZnlink;
    }

    public void setRaidZnlink(String raidZnlink) {
        this.raidZnlink = raidZnlink;
    }

    public String getRaidKpwptlink() {
        return raidKpwptlink;
    }

    public void setRaidKpwptlink(String raidKpwptlink) {
        this.raidKpwptlink = raidKpwptlink;
    }

    public String getRaidStartpoint() {
        return raidStartpoint;
    }

    public void setRaidStartpoint(String raidStartpoint) {
        this.raidStartpoint = raidStartpoint;
    }

    public String getRaidFinishpoint() {
        return raidFinishpoint;
    }

    public void setRaidFinishpoint(String raidFinishpoint) {
        this.raidFinishpoint = raidFinishpoint;
    }

    public String getRaidRuleslink() {
        return raidRuleslink;
    }

    public void setRaidRuleslink(String raidRuleslink) {
        this.raidRuleslink = raidRuleslink;
    }

    public String getRaidStartlink() {
        return raidStartlink;
    }

    public void setRaidStartlink(String raidStartlink) {
        this.raidStartlink = raidStartlink;
    }

    public String getRaidFolder() {
        return raidFolder;
    }

    public void setRaidFolder(String raidFolder) {
        this.raidFolder = raidFolder;
    }

    public Date getRaidRegistrationenddate() {
        return raidRegistrationenddate;
    }

    public void setRaidRegistrationenddate(Date raidRegistrationenddate) {
        this.raidRegistrationenddate = raidRegistrationenddate;
    }

    public Date getRaidClosedate() {
        return raidClosedate;
    }

    public void setRaidClosedate(Date raidClosedate) {
        this.raidClosedate = raidClosedate;
    }

    public String getRaidLegendlink() {
        return raidLegendlink;
    }

    public void setRaidLegendlink(String raidLegendlink) {
        this.raidLegendlink = raidLegendlink;
    }

    public String getRaidZiplink() {
        return raidZiplink;
    }

    public void setRaidZiplink(String raidZiplink) {
        this.raidZiplink = raidZiplink;
    }

    public Integer getRaidNoshowresult() {
        return raidNoshowresult;
    }

    public void setRaidNoshowresult(Integer raidNoshowresult) {
        this.raidNoshowresult = raidNoshowresult;
    }

    public String getRaidFileprefix() {
        return raidFileprefix;
    }

    public void setRaidFileprefix(String raidFileprefix) {
        this.raidFileprefix = raidFileprefix;
    }

    public Integer getRaidReadonlyhoursbeforestart() {
        return raidReadonlyhoursbeforestart;
    }

    public void setRaidReadonlyhoursbeforestart(Integer raidReadonlyhoursbeforestart) {
        this.raidReadonlyhoursbeforestart = raidReadonlyhoursbeforestart;
    }

    public Integer getRaidMapprice() {
        return raidMapprice;
    }

    public void setRaidMapprice(Integer raidMapprice) {
        this.raidMapprice = raidMapprice;
    }

    public Integer getRaidNotstartfee() {
        return raidNotstartfee;
    }

    public void setRaidNotstartfee(Integer raidNotstartfee) {
        this.raidNotstartfee = raidNotstartfee;
    }

    public Integer getRaidNostartprice() {
        return raidNostartprice;
    }

    public void setRaidNostartprice(Integer raidNostartprice) {
        this.raidNostartprice = raidNostartprice;
    }

    public Integer getRaidTeamslimit() {
        return raidTeamslimit;
    }

    public void setRaidTeamslimit(Integer raidTeamslimit) {
        this.raidTeamslimit = raidTeamslimit;
    }
}
