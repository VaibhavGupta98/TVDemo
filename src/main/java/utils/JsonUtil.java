package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonUtil {

    public static JSONObject getJsonObject() throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader(".\\src\\test\\resources\\TeamRCB.json");
        return (JSONObject) jsonParser.parse(fileReader);

    }

}
