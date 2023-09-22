package corejava;

public class EnumRunner {

	public static void main(String[] args) {
		
		//once an Execution Begins , an Enum that is being accessed will be returned and Stored in an Enum Type and if the value is initialized ,then internally an Enum Constructor will be called 
		severity s =severity.SPRING;
		 String name = s.name();
		 System.out.print(name);
		//int a = s.getFixinghours();
		//System.out.print(a);

	}

}
