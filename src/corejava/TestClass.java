package corejava;

public class TestClass {
	
	 public static void main(String[] args) {  
	     TestClass obj = new TestClass();  
	     Class<? extends TestClass> Class1 = obj.getClass();  
	     String nm = Class1.getName();  
	      System.out.println(" The Class Name = " +nm);  
	      
	     String name = TestClass.class.getName();
	     
	     System.out.print(name);
	  }  
	}  


