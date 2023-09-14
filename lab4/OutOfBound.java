package lab4;

import java.util.Random;

public class OutOfBound {

	public static int[] random(int[] randoms) {

		for (int i = 0; i < randoms.length; i++) {
			Random rando = new Random();
			randoms[i] = rando.nextInt();

		}

		return randoms;

	}
	
	

}
