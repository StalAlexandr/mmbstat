package ru.alexandrstal.mmbstat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

public class MMBData {

    @JsonProperty("Distances")
    @Id
    private Distance[] distances;

    @JsonProperty("Raids")
    private Raid[] raids;

    @JsonProperty("Teams")
    private Team[] teams;

    @JsonProperty("Users")
    private User[] users;

    @JsonProperty("Invitations")
    private Invitation[] invitations;

    @JsonProperty("Levels")
    private Level[] levels;

    @JsonProperty("TeamUsers")
    private TeamUser[] teamUsers;

    @JsonProperty("TeamLevelDismiss")
    private TeamLevelDismiss[] teamLevelDismisses;

    public Distance[] getDistances() {
        return distances;
    }

    public void setDistances(Distance[] distances) {
        this.distances = distances;
    }

    public Raid[] getRaids() {
        return raids;
    }

    public void setRaids(Raid[] raids) {
        this.raids = raids;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Invitation[] getInvitations() {
        return invitations;
    }

    public void setInvitations(Invitation[] invitations) {
        this.invitations = invitations;
    }

    public Level[] getLevels() {
        return levels;
    }

    public void setLevels(Level[] levels) {
        this.levels = levels;
    }

    public TeamUser[] getTeamUsers() {
        return teamUsers;
    }

    public void setTeamUsers(TeamUser[] teamUsers) {
        this.teamUsers = teamUsers;
    }

    public TeamLevelDismiss[] getTeamLevelDismisses() {
        return teamLevelDismisses;
    }

    public void setTeamLevelDismisses(TeamLevelDismiss[] teamLevelDismisses) {
        this.teamLevelDismisses = teamLevelDismisses;
    }
}
