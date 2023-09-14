package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter ten integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(userinput.nextInt());
		}
		
		
		Num2 nums = new Num2(list);
		
		Num2.RemoveDuplicates(nums);
				
		}
	
}
