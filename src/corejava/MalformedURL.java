package corejava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MalformedURL {
   
	  public static void main(String[] args) throws IOException {
	      String url = "http://www.tutorialspoint.com/";
	      URL obj = new URL(url);
	      //Opening a connection
	      HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
	      //Sending the request
	      conn.setRequestMethod("GET");
	      int response = conn.getResponseCode();
	      if (response == 200) {
	         //Reading the response to a StringBuffer
	         Scanner responseReader = new Scanner(conn.getInputStream());
	         StringBuffer buffer = new StringBuffer();
	         while (responseReader.hasNextLine()) {
	            buffer.append(responseReader.nextLine()+" ");
	
	         }
	         responseReader.close();
	         //Printing the Response
	         System.out.println(buffer.toString());
	      }
	   }
	}
	
	
	

