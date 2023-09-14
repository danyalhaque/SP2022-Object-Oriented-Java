package lab1;

import java.util.Scanner;

public class TemperatureDriver {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);

		System.out.print("Enter a degree in Celsius: ");
		Temperature temperature = new Temperature(userinput.nextDouble());

		System.out.printf("%.0f Celsius is %.1f Fahrenheit ", temperature.getCelsius(),
				temperature.Coversion(temperature.getCelsius()));

	}
	
	

}
