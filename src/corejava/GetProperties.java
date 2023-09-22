package corejava;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class GetProperties {

	
			public static void main(String[] args) throws Exception
			{
				// get all the system properties
				Properties p = System.getProperties();

				// stores set of properties information
				Set set = p.entrySet();

				// iterate over the set
				Iterator itr = set.iterator();
				while (itr.hasNext()) {

					// print each property
					Map.Entry entry = (Map.Entry)itr.next();
					System.out.println(entry.getKey() + " = "
									+ entry.getValue());
				}
			}
		


	}


