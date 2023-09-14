package assignment4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = null;

		Scanner userinput = new Scanner(System.in);

		Pattern pattern = new Pattern();

		System.out.print("Enter a string s1: ");
		s1 = userinput.nextLine();
		System.out.print("Enter a string s2: ");
		s2 = userinput.nextLine();
		System.out.printf("Matched at index %d", pattern.Matching(s1, s2));
	}

}
