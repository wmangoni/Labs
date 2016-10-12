package Conversor;

public class ConversorTestDrive {

	public static void main(String[] args) {
		Conversor c = new Conversor();
		c.convertCelsiusInFahrenheit(40.00);
		c.print();
		c.convertFahrenheitInCelsius(104.0);
		c.print();
	}

}
