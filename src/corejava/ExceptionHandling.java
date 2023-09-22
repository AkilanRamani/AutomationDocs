package corejava;

public class ExceptionHandling {
	public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch(ArithmeticException e){
			   
			   System.out.println(e);
			   throw new ArithmeticException("cannot be divided by Zero"); 
			   }  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
		}  


