package in.myvedik.android.contactus;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by admin on 10-01-2017.
 */

public class JsonParser {
    private static HashMap<String,Object> hashMap;

    private String string =" [\n"+
            "      {\n"+
            "        \"type\":\"Secretary\",\n"+
            "        \"profile\":[{\"name\":\"M Vidyadhar\", \"email\":\"m.vidyadhar95@gmail.com\", \"phone\":\"9952044531\"},\n"+
            "        {\"name\":\"S Chandra vadan\", \"email\":\"scvchandras@gmail.com\", \"phone\":\"9884181579\"}\n"+
            "      ]},\n"+
            "      {\n"+
            "        \"type\":\"Joint Secretary\",\n"+
            "        \"profile\":[{\"name\":\"Ankit Jain\",\"email\":\"bhaiji.ankitjain1993@gmail.com\",\"phone\":\"9043807215\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Events\",\n"+
            "        \"profile\":[{\"name\":\"K Akhil\",\"email\":\"akhilkollu96@gmail.com\",\"phone\":\"9176493264\"},\n"+
            "        {\"name\":\"M V Suhaas\",\"email\":\"suhaasmekala@gmail.com\",\"phone\":\"8220154858\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Student Relations\",\n"+
            "        \"profile\":[{\"name\":\"Naveen Kanna M\",\"email\":\"naveenkanna28@gmail.com\",\"phone\":\"9087295757\"},\n"+
            "        {\"name\":\"T Sumanth Kalyan\",\"email\":\"sumanth.kalyan79@gmail.com\",\"phone\":\"9790465204\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Sponsorship & Public Relations\",\n"+
            "        \"profile\":[{\"name\":\"Hitesh Malla\",\"email\":\"hitesh.m95@gmail.com\",\"phone\":\"9087863969\"},\n"+
            "        {\"name\":\"Kartheek K\",\"email\":\"kartheek301096@gmail.com\",\"phone\":\"9677077500\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Web & Mobile Operations\",\n"+
            "        \"profile\":[{\"name\":\"K Venkat Teja\",\"email\":\"teja.kunisetty@gmail.com\",\"phone\":\"7200317939\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Design & Media\",\n"+
            "        \"profile\":[{\"name\":\"M Ravi Theja\",\"email\":\"ravithejamavuri@gmail.com \",\"phone\":\"9790464008\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Finance\",\n"+
            "        \"profile\":[{\"name\":\"B Bhanu Mitra\",\"email\":\"bhanumitrab@gmail.com\",\"phone\":\"9087863231\"},\n"+
            "        {\"name\":\"S Maneesha Devi\",\"email\":\"rajsridevi598@gmail.com\",\"phone\":\"9790469606\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"Facilities & Requirements\",\n"+
            "        \"profile\":[{\"name\":\"Cesh J\",\"email\":\"ceshcool@gmail.com\",\"phone\":\"9940451199\"}]\n"+
            "      },\n"+
            "      {\n"+
            "        \"type\":\"QMS\",\n"+
            "        \"profile\":[{\"name\":\"S Bharath\",\"email\":\"rocky.bharath1997@gmail.com\",\"phone\":\"9791336202\"}]\n"+
            "      }\n"+
            "\n"+
            "    ]";
    public HashMap<String,Object> getProfiles(int i){
        hashMap= new HashMap<>();
        try {
            JSONArray jsonArray =  new JSONArray(string);
            JSONObject jsonObject= jsonArray.getJSONObject(i);
            hashMap.put("type",jsonObject.getString("type"));
            JSONArray profileArray =jsonObject.getJSONArray("profile");
            HashMap<String,String> profile= new HashMap<>();
            for(int j=0;j<profileArray.length();j++){
                JSONObject c= profileArray.getJSONObject(j);
                profile.put("name",c.getString("name"));
                profile.put("email",c.getString("email"));
                profile.put("phone",c.getString("phone"));
                hashMap.put("i",profile);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return hashMap;
    }
}
