package corejava;

public class TestMethodReference {

	public static void main(String[] args) {
		//*** Using Lambda Expression ***//
		A1 a1 = (x) -> { // 10 => 10>-10 (true) 10<10 => (False)
			return x > -10 && x < 10;
			};
			
		System.out.println(a1.checkSingleDigit(10));
		
		//*** Using Method Reference ***//
		A1 a2 = Digit::isSingleDigit;
		System.out.println(a2.checkSingleDigit(9));
	}


	}


