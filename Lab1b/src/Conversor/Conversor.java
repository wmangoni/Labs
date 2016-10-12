package Conversor;

public class Conversor {
	private double temp;
	
	public void convertCelsiusInFahrenheit(double celsius) {
		this.setTemp( (9 * celsius)/5 + 32 );
	}
	public void convertFahrenheitInCelsius(double fahrenheit) {
		this.setTemp( (fahrenheit - 32) * 5/9 );
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTemp() {
		return this.temp;
	}
	public void print() {
		System.out.println( this.getTemp() );
	}
	
}
