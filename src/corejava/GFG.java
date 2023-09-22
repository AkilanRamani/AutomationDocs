package corejava;

import java.util.HashMap;
import java.util.Map;

public class GFG {
			// Main driver method
			public static void main(String args[])
			{
				// Creating an empty HashMap
				Map<String, Integer> hm
					= new HashMap<String, Integer>();

				// Inserting pairs in above Map
				// using put() method
				hm.put("a", 100);
				
				// Traversing through Map using for-each loop
				for (Map.Entry<String, Integer> me :
					hm.entrySet()) {

					// Printing keys
					System.out.print(me.getKey() + ":");
					System.out.println(me.getValue());
				}
			}
	}


