package edu.escuelaing.arem;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConection extends  Thread{
    private static final String GET_URL ="https://temperatureconverterarep.herokuapp.com/index.html";
    private static final String USER_AGENT = "Mozilla/5.0";
    @Override
    public void run(){
        try{
            URL obj = new URL(GET_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent",USER_AGENT);



        }catch(IOException e){
            e.printStackTrace();

        }

    }

}
