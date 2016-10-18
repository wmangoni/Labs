package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import decoder.MorseDictionary;

public class MorseDictionaryTest {

	public MorseDictionary d;
	
	@Before
	public void setDicionario() {
		d = new MorseDictionary();
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
