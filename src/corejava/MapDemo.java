package corejava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		  // Creating an empty Map
        Map<String, String> map = new HashMap<String, String>();
 
        // Mapping int values to string keys
        map.put("Geeks", "10");
        map.put("4", "15");
        map.put("Geeks", " ");
        map.put("Welcomes","90");
        map.put("You", "30");
       
        // Displaying the Map
       System.out.println("Initial Mappings are: " + map);
 
        // Getting the value of "Geeks"
        System.out.println("The Value is: " + map.get("Geeks"));
 
        // Getting the value of "You"
        //System.out.println("The Value is: " + map.get("You"));
    }
}

	


