package lalit.loveshayari.activity;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by lalit on 11/10/2017.
 */
public class JSONParser {
    static InputStream is = null;
    static JSONObject jobj = null;
    static String son = "";

    public JSONParser() {

    }

    public JSONObject makeHttpRequest(String url, String mathod, List<NameValuePair> parms) {
        try {
            if (mathod == "POST") {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(url);
                httpPost.setEntity(new UrlEncodedFormEntity(parms));
                HttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                is = httpEntity.getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            son = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            jobj = new JSONObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jobj;
    }


}
