import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class UserProfile {

	@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
        	Object obj = parser.parse(new FileReader(
                    "E:/Movie Rec/src/json/fblikes.json"));
            
            JSONObject jsonObject = (JSONObject) obj;
 
           // String name = (String) jsonObject.get("Name");
            //String author = (String) jsonObject.get("Author");            
            //JSONArray names = jsonObject.getJSONArray("data");
            //for(int i=0;i<names.length();i++)
            //System.out.println("Name: " + name);
            //System.out.println("Author: " + author);
            
            JSONArray fullList = (JSONArray) jsonObject.get("data");
            System.out.println("\nComplete List:");
            Iterator<JSONObject> iterator = fullList.iterator();
            while (iterator.hasNext()) {
            	JSONObject userobj = (JSONObject)iterator.next();
            	String name = (String)userobj.get("name");
                System.out.println(name);
                
                JSONArray likesList = (JSONArray) jsonObject.get("likes");
                Iterator<JSONObject> iterator1 = likesList.iterator();
                System.out.println(name);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
