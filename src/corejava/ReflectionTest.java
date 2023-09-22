package corejava;

public class ReflectionTest {
	
	

		 public static void main(String args[]){  
		  try{  
		  Class c=Class.forName("Simple");  
		  @SuppressWarnings("deprecation")
		  Simple s=(Simple)c.newInstance();  
	      s.message();
		  
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		 
		  
		 }  
		}  


