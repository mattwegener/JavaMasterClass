package tech.wegener.Masterclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=cats");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent","Chrome");
            connection.setReadTimeout(10000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if(responseCode != 200){
                System.out.println("Error reading webpage");
                System.out.println(connection.getResponseMessage());
                return;
            }

            String line;
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while((line = inputReader.readLine()) != null){
                System.out.println(line);
            }


//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//

//
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//            for(Map.Entry<String,List<String>> entry: headerFields.entrySet()){
//                String key = entry.getKey();
//                List<String> value = entry.getValue();
//                System.out.println("----key = " + key);
//                for(String string : value){
//                    System.out.println("Value = " + value);
//                }
//            }

//            String line = "";
//            while(line != null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();

        }catch (MalformedURLException e){
            System.out.println("Malformed URL: " + e.getMessage());
        } catch(IOException e){
            System.out.println("I/O exception: " + e.getMessage());
        }
    }
}
