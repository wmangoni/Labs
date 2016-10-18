package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import MorseDecoder.Dicionario;

public class DicionarioTest {
	public Dicionario d;
	
	@Before
	public void setDicionario() {
		d = new Dicionario();
	}

	@Test
	public void testEncodeA() {
		assertEquals("._", d.encode("a"));
	}
	@Test
	public void testDecodeA() {
		assertEquals("a", d.decode("._"));
	}
	@Test
	public void testEncodeM() {
		assertEquals("__", d.encode("m"));
	}
	@Test
	public void testDecodeM() {
		assertEquals("m", d.decode("__"));
	}

}
