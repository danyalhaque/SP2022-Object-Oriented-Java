package assignment3;

public class ReverseString {

	private static String reversed = "";
	private static String initial = "";

	public static void reverseDisplay(String value) {

		if (value.isEmpty()) {
			System.out.printf("The reversed string of %s is: '%s'",initial, reversed);
			return;
		}
		
		reversed += value.charAt(value.length() - 1);

		reverseDisplay(value.substring(0, (value.length() - 1)));

	}

	public static String getReversed() {
		return reversed;
	}

	public static void setReversed(String reversed) {
		ReverseString.reversed = reversed;
	}

	public static String getInitial() {
		return initial;
	}

	public static void setInitial(String initial) {
		ReverseString.initial = initial;
	}

}
