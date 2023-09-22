package corejava;

import java.util.ArrayList;
import java.util.List;

public class ElementsList {

	public static void main(String[] args) {
		 List<String> al = new ArrayList<>();
		
		 
	        // Adding elements to object of List interface
	        // Custom elements
	        al.add("Geeks");
	        al.add("Geeks");
	        al.add(1, "For");
	 
	        // Print all the elements inside the
	        // List interface object
	        System.out.println(al);
	    }
	}


