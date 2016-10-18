package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import decoder.LeetDictionary;

public class LeetDictionaryTest {

	public LeetDictionary d;
	
	@Before
	public void setDicionario() {
		d = new LeetDictionary();
	}

	@Test
	public void testEncodeA() {
		assertEquals("@", d.encode("a"));
	}
	@Test
	public void testDecodeA() {
		assertEquals("a", d.decode("@"));
	}
	@Test
	public void testEncodeM() {
		assertEquals("|V|", d.encode("m"));
	}
	@Test
	public void testDecodeM() {
		assertEquals("m", d.decode("|V|"));
	}

}