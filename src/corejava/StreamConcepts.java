package corejava;

import java.util.Arrays;
import java.util.List;

public class StreamConcepts {
	
	 // Driver code
    public static void main(String[] args) {
         
    // Creating a list of Integers
    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
     
    // Check if all elements of stream
    // are divisible by 3 or not using
    // Stream allMatch(Predicate predicate)
    boolean answer = list.stream().allMatch(n-> n % 3 ==0);
     
    // Displaying the result
    System.out.println(answer);
}
}


