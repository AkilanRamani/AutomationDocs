package corejava;



public class TryWithResources {
	
	 public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch(ArithmeticException e){
			   throw new ArithmeticException("qqq");
			
			   }  
		  
		} 
}