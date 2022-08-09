package tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JsonUtil;

import java.io.IOException;

public class Test1 {

    @Test
    public void ForeignPlayersTest() throws IOException, ParseException {

        JSONObject jsonObject = JsonUtil.getJsonObject();

        JSONArray jsonArray = (JSONArray) jsonObject.get("player");
        int foreignPlayers=0;

        for (Object o : jsonArray) {
            JSONObject object = (JSONObject) o;
            if (!object.get("country").equals("India")) {
                foreignPlayers++;
            }

        }
        System.out.println(foreignPlayers);


        Assert.assertEquals(foreignPlayers, 4);
    }

    @Test
    public void HasWicketKeeperTest() throws IOException, ParseException {
        JSONObject jsonObject = JsonUtil.getJsonObject();
        JSONArray jsonArray = (JSONArray) jsonObject.get("player");

        boolean hasWicketKeeper = false;

        for (Object o : jsonArray) {
            JSONObject object = (JSONObject) o;
            if (object.get("role").equals("Wicket-keeper")) {
                hasWicketKeeper = true;
            }
        }
        Assert.assertTrue(hasWicketKeeper);

    }


}
