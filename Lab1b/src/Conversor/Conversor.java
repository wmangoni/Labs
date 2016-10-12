package Conversor;

public class Conversor {
	private double temp;
	
	public void convertCelsiusInFahrenheit(double celsius) {
		this.setTemp( (9 * celsius)/5 + 32 );
	}
	public void convertFahrenheitInCelsius(double fahrenheit) {
		this.setTemp( (fahrenheit - 32) * 5/9 );
	}
	public void convertKelvinInCelsius(double kelvin) {
		this.setTemp( kelvin - 273.15 );
	}
	public void convertCelsiusInKelvin(double celsius) {
		this.setTemp( celsius + 273.15 );
	}
	public void convertFahrenheitInKelvin(double fahrenheit) {
		this.convertFahrenheitInCelsius(fahrenheit);
		this.convertCelsiusInKelvin(this.temp);
	}
	public void convertKelvinInFahrenheit(double kelvin) {
		this.convertKelvinInCelsius(kelvin);
		this.convertCelsiusInFahrenheit(this.temp);
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
