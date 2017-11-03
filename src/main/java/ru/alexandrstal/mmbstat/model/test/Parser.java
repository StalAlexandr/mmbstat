package ru.alexandrstal.mmbstat.model.test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.alexandrstal.mmbstat.model.Invitation;
import ru.alexandrstal.mmbstat.model.MMBData;
import ru.alexandrstal.mmbstat.model.Team;
import ru.alexandrstal.mmbstat.model.User;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;

public class Parser {

    static String readFile()
            throws IOException
    {
        String file = "/home/astal/maindata.json";
        byte[] encoded = Files.readAllBytes(Paths.get(file));
        return new String(encoded);
    }

    public static void main(String[] args) throws IOException {

        String data = readFile();

        data = data.replaceAll("(\\r|\\n)", "");
  /*
        data = data.replaceAll("team_ minlevelpointorderwitherror", "team_minlevelpointorderwitherror");
        data = data.replaceAll("team_ result", "team_result");
*/
     //   data = data.replaceAll("\'", "");


        System.out.println(data);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        objectMapper.setDateFormat(df);
        MMBData mmbData = objectMapper.readValue(data, MMBData.class);

    }
}
