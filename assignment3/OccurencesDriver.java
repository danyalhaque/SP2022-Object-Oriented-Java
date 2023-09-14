package assignment3;

import java.util.Scanner;

public class OccurencesDriver {

	public static void main(String[] args) {

		String str = null;
		char a;
		
		Occurences occurence = new Occurences();

		Scanner userinput = new Scanner(System.in);
		System.out.print("Please enter string: ");
		str = userinput.nextLine();
		System.out.print("Please enter character: ");
		a = userinput.next().charAt(0);

		System.out.printf("%s has %d instances of %s",str, occurence.count(str, a), a);
		
	}

}
