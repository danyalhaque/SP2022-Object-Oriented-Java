package assignment3;

import java.util.Scanner;

public class ReverseStringDriver {

	public static void main(String[] args) {

		String s = null;

		ReverseString reverse = new ReverseString();

		Scanner userinput = new Scanner(System.in);
		System.out.print("Please enter string: ");
		s = userinput.next();

		reverse.setInitial(s);
		
		reverse.reverseDisplay(s);

	}

}
