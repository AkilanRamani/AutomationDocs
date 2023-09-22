package corejava;

public class Test {
	public static void getInfo(String info) {
		System.out.println(info);
	}

	public static void main(String[] args) {
		
		//getName() Method is an abstract Method which has its implementation in Class with the lambda Expression.
		
	    A a = (String s) -> System.out.println(s); //providing implementation of getName(String name) using Lambda Expression ,implementation of the abstract Method can be defined in Class Only.
	    a.getName("SAM is executing"); 
		
		
		//getName() Method is an abstract Method which has its implementation in Class with the method(static method) getInfo() and this static method refers to the method of the Functional Interface.
        
	    // syntax : Classname(implemented class)::methodname
	   // getInfo method refers to the Method in Interface(Funtional Interface) since both the getInfo() method has the similar parameters as the getName() Method of Interface.
		 A a1 = Test::getInfo; // refering to pre-existing getInfo(String info) of class Test as arguments are same as getName(String name)
		
		a1.getName("getInfo() of Test class is executing");
	}
}
