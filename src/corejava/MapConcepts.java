package corejava;

import java.util.HashMap;
import java.util.Map;

public class MapConcepts {
	
	public static void main(String[] args)
    {
        // Creating an empty Map
        Map<String, Object> map = new HashMap<String, Object>();
 
        // Mapping int values to string keys
        map.put("Geeks", 10);
        map.put("4", 15);
        map.put("Geeks", 20);
        map.put("Welcomes", 25);
        map.put("You", 30);
 
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
       String geeks =  String.valueOf(map.get("geeks"));
       System.out.println("The Value is: " + geeks);
 
        // Getting the value of "Geeks"
        System.out.println("The Value is: " + map.get("Geeks"));
 
        // Getting the value of "You"
        System.out.println("The Value is: " + map.get("You"));
    }
}


