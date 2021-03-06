package ru.alexandrstal.mmbstat.model.parsers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class StringDurationDeserializer   extends JsonDeserializer<Long>{

    @Override
    public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        if (("null".equals(jsonParser.getText()))||(null==jsonParser.getText())){
            return null;
        }
        String fields[] = jsonParser.getText().split(":");
        if (fields.length!=3){
            return null;
        }
        return (long)Integer.parseInt(fields[0])*60*60+Integer.parseInt(fields[1])*60+Integer.parseInt(fields[2]);
    }
}
