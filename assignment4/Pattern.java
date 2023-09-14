package assignment4;

public class Pattern {

	public int Matching(String s1, String s2) {
		int n = s1.length()-s2.length();
		String match = s1;
		int index = 0;

		for (int i = 0; i <= n; i++) {
			String tempMatch;
			tempMatch = s1.substring(i, s2.length() + i);

			if (tempMatch.equals(s2)) {
				match = tempMatch;
				index = i;

			}
		}

		if (match.equals(s2) == false && index == 0) {
			System.err.println("No matches");
		}

		return index;

	}

}
