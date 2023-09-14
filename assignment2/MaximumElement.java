package assignment2;

public class MaximumElement {

	public static <E extends Comparable<E>> E max(E[] list) {

		E maximumValue = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(maximumValue) > 0) {
				maximumValue = list[i];

			}

		}

		return maximumValue;

	}

}
