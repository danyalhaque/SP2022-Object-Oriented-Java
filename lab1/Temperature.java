package lab1;

public class Temperature {
	private double fahrenheit;
	private double celsius;

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public Temperature(double celsius) {
		this.celsius = celsius;

	}

	public Temperature() {
		this.celsius = celsius;

	}

	
	public double Coversion(double celsius) {
		this.fahrenheit = (9.0 / 5) * celsius + 32;

		return fahrenheit;

	}

	public static String toString(Temperature temperature) {
		return "stack: " + temperature.toString();
	}


}
