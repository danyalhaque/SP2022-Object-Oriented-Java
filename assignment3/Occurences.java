package assignment3;

public class Occurences {
	
private static int amount = 0;

	public static int count(String str, char a) {
	
		String letter = "";
		letter += a;
		
		
		
		if(str.contains(letter)) {
			amount++;
			return count(str.substring(str.indexOf(a)+1),a);
		}
		
		return amount;
		
	}
	
}
