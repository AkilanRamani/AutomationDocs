package corejava;

import java.io.FileOutputStream;

public class FileStream {
	
	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("C:\\Users\\akilan\\Documents\\stockupdate.txt");    
           fout.write(65);    
            
           System.out.println("success...");    
          }catch(Exception e){System.out.println(e);}    
    }    

}
