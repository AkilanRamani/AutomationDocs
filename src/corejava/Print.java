package corejava;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print myPrint = new Print();
		Class<Print> p = Print.class; //which will Return an Object of Print type class 
		System.out.println(p.getName());
		System.out.println(myPrint.getClass().getName());

	}

}
