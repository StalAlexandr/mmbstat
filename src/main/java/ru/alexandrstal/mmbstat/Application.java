package ru.alexandrstal.mmbstat;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.alexandrstal.mmbstat.configuration.AppConfig;
import ru.alexandrstal.mmbstat.model.Distance;
import ru.alexandrstal.mmbstat.model.Raid;
import ru.alexandrstal.mmbstat.model.Team;
import ru.alexandrstal.mmbstat.model.User;
import ru.alexandrstal.mmbstat.service.DistanceService;
import ru.alexandrstal.mmbstat.service.RaidService;
import ru.alexandrstal.mmbstat.service.TeamService;
import ru.alexandrstal.mmbstat.service.UserService;

import java.util.Calendar;

/**
 * Created by astal on 03.11.17.
 */
public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        RaidService rs = (RaidService) context.getBean("raidService");

        Raid raid =new Raid();
        raid.setRaidId(1);
        raid.setRaidName("MMB");
raid.setRaidPeriod("");

rs.save(raid);

        DistanceService service = (DistanceService) context.getBean("distanceService");

        Distance distance = new Distance();
        distance.setDistanceId(1);
        distance.setRaidId(1);
        distance.setDistanceName("A");
        distance.setDistanceData(Calendar.getInstance().getTime());

System.out.println("*********");
        service.save(distance);
        System.out.println("*********");


        UserService us = context.getBean("userService", UserService.class);

        User u = new User();
        u.setUserId(1);
        u.setUserName("AA");
        u.setUserBirthYear(1);

        us.save(u);


        TeamService ts = context.getBean("teamService", TeamService.class);

Team t = new Team();
t.setTeamId(1);
        t.setTeamName("Z");
        t.setDistanceId(1);

ts.save(t);

    }

}
