package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Conversor.Conversor;

public class ConversorTest {
	public Conversor c;

	@Before
	public void instantiateConversor(){
		this.c = new Conversor();
	}
	@Test
	public void testCelsiusInFahrenheit() {
		c.convertCelsiusInFahrenheit(40.0);
		assertEquals(104.0, c.getTemp(), 0.001);
	}
	@Test
	public void testFahrenheitInCelsius() {
		c.convertFahrenheitInCelsius(104.0);
		assertEquals(40.0, c.getTemp(), 0.001);
	}

}
