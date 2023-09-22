package corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrow {

	
	 public static void method() throws IOException {  
		  
	        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file);  
	        fileInput.close();
	  
	      
	        
	      
	    }  
	    //main method  
	    public static void main(String args[]) throws IOException {  
	        
	            method();  
	        
	        System.out.println("rest of the code...");    
	  }    
	}    

