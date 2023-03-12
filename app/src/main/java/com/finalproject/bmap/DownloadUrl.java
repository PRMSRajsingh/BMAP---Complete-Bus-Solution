package com.finalproject.bmap;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadUrl {

    //Create a http connection to communicate with url

    public String retireveUrl(String url) throws IOException {
        String urlData = "";
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;

        try {
            URL getUrl = new URL(url);
            httpURLConnection = (HttpURLConnection) getUrl.openConnection();
            httpURLConnection.connect();
            // reading the data from url
            inputStream = httpURLConnection.getInputStream();

            //Used to read the input stream

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer sb = new StringBuffer();

            String line = "";

            // Use Loop, to read the data
            while ((line = bufferedReader.readLine()) != null) {

                sb.append(line);
            }
            urlData = sb.toString();
            bufferedReader.close();


        } catch (Exception e) {
            Log.d("Exception", e.toString());
        } finally {
            inputStream.close();
            httpURLConnection.disconnect();
        }
        return urlData;
    }
}
