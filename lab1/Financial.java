package lab1;

public class Financial {

	private double money;
	private double gratuity;

	public Financial(double money, double gratuity) {
		this.money = money;
		this.gratuity = gratuity;
		
	}
	
	public Financial() {
		this.money = money;
		this.gratuity = gratuity;
		
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getGratuity() {
		return gratuity;
	}

	public void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}
	
	public void calculateGratuity(double money, double gratuity) {
		
		double gratuityCalculated = gratuity/money ;
		double totalAmount = gratuityCalculated + money;
		
		System.out.printf("The gratuity is $%.1f and the total is $%.1f", gratuityCalculated, totalAmount);
	
		
	}
	public static String toString(Financial amount) {
		return "stack: " + amount.toString();
	}


	
	
}
