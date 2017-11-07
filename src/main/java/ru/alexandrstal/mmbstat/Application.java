package ru.alexandrstal.mmbstat;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.alexandrstal.mmbstat.configuration.AppConfig;
import ru.alexandrstal.mmbstat.model.*;
import ru.alexandrstal.mmbstat.service.DistanceService;
import ru.alexandrstal.mmbstat.service.RaidService;
import ru.alexandrstal.mmbstat.service.TeamService;
import ru.alexandrstal.mmbstat.service.UserService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by astal on 03.11.17.
 */
public class Application {
    public static void main(String[] args) throws IOException {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TeamService ts = context.getBean("teamService", TeamService.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        objectMapper.setDateFormat(df);


        String data = readFile("/home/astal/maindata2015.json");
        MMBData mmbData = parse(data);

        Team[] teams = mmbData.getTeams();
        for (Team t:teams){
            ts.save(t);
        }
    }

    static MMBData parse(String data) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        objectMapper.setDateFormat(df);

        data = data.replaceAll("(\\r|\\n)", "");
        return objectMapper.readValue(data, MMBData.class);
    }

    static String readFile(String file)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(file));
        return new String(encoded);
    }


}
