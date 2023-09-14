package assignment2;

public class Driver {

	public static void main(String[] args) {

		Integer[] list1 = { 1, 100, 1000 };
		Double[] list2 = { 1.5, 100.5, 1000.5 };
		String[] list3 = { "Hello", "Welcome", "Goodbye" };

		System.out.printf("%d%n", MaximumElement.max(list1));
		System.out.printf("%.1f%n", MaximumElement.max(list2));
		System.out.printf("%s%n", MaximumElement.max(list3));

	}

}
