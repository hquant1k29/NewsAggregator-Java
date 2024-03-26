package callapi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class CallNewsApi {
	public void call() {
		try {

            URL url = new URI("https://newsapi.org/v2/everything?q=blockchain&from=2024-03-24&to=2024-03-24&sortBy=popularity&apiKey=dc20f832f5f744948c18273b3f0fcfba").toURL();

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();

                System.out.println(informationString);


//                //JSON simple library Setup with Maven is used to convert strings to JSON
//                JSONParser parse = new JSONParser();
//                JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(informationString));
//
//                //Get the first JSON object in the JSON array
//                System.out.println(dataObject.get(0));
//
//                JSONObject countryData = (JSONObject) dataObject.get(0);
//
//                System.out.println(countryData.get("woeid"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}