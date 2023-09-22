package corejava;

public class TestEnum {
	
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
	//creating the main method  
	public static void main(String[] args) {  
	//printing all enum  
	for (Season s : Season.values()){  
	System.out.println(s);  
	}  
	Season s1 = Season.valueOf("FALL");
	int a = s1.ordinal();
	System.out.println(a);
	System.out.println("Value of WINTER is: "+s1);  
	System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
	System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
	  
	}}  


