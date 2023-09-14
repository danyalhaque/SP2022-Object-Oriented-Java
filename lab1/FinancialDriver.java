package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class FinancialDriver {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		
		Financial amount = new Financial(userinput.nextDouble(),userinput.nextDouble());
		
		amount.calculateGratuity(amount.getMoney(), amount.getGratuity());
		
		System.out.println(amount.toString());
	}

	
	
}
