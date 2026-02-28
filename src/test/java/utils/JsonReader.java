package utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;

public class JsonReader{
    public static Object[][] getLoginData() {
        Object[][] data = null;
        try {

            // Read JSON file as String
            BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/testData/loginData.json"));
            String line;
            StringBuilder jsonData = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }
            reader.close();

            // Convert String to JSON Array
            JSONArray jsonArray = new JSONArray(jsonData.toString());

            data = new Object[jsonArray.length()][2];

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject obj = jsonArray.getJSONObject(i);

                data[i][0] = obj.getString("username");
                data[i][1] = obj.getString("password");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
