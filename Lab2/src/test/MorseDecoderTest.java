package test;

import static org.junit.Assert.*;

import org.junit.Test;

import MorseDecoder.MorseDecoder;

public class MorseDecoderTest {

	@Test
	public void testEncodeString() {
		MorseDecoder md = new MorseDecoder("Hello World");
		assertEquals(".... . ._.. ._.. ___    .__ ___ ._. ._.. _..", md.encoder(md.getMsg()));
	}
	@Test
	public void testDecodeString() {
		MorseDecoder md = new MorseDecoder(".... . ._.. ._.. ___    .__ ___ ._. ._.. _..");
		assertEquals("hello world", md.decoder(md.getMsg()));
	}

}
