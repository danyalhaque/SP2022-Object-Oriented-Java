package lab4;

import java.util.Scanner;

public class OutOfBoundDriver {

	public static void main(String[] args) {
		int[] randoms = new int[100];

		randoms = OutOfBound.random(randoms);
		
		Scanner userinput = new Scanner(System.in); 
		System.out.print("Choose the index of the array from 0-99: ");
		
		try {
		
			System.out.printf("%d", randoms[userinput.nextInt()]);
			
		}
	
	catch (ArrayIndexOutOfBoundsException ex){
		
		System.err.println("Out of Bounds.");
	}
	
		

}
}