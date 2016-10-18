package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import decoder.Decoder;
import decoder.MorseDictionary;
import decoder.LeetDictionary;

public class DecoderTest {

	@Test
	public void testEncodeStringMorse() {
		Decoder md = new Decoder( "Hello World", new MorseDictionary() );
		assertEquals(".... . ._.. ._.. ___    .__ ___ ._. ._.. _..", md.encoder(md.getMsg()));
	}
	@Test
	public void testDecodeStringMorse() {
		Decoder md = new Decoder( ".... . ._.. ._.. ___    .__ ___ ._. ._.. _..", new MorseDictionary() );
		assertEquals("hello world", md.decoder(md.getMsg()));
	}
	
	@Test
	public void testEncodeStringLeet() {
		Decoder md = new Decoder( "Hello World", new LeetDictionary() );
		assertEquals("# & 1_ 1_ ()    `/ () 12 1_ |>", md.encoder(md.getMsg()));
	}
	@Test
	public void testDecodeStringLeet() {
		Decoder md = new Decoder( "# & 1_ 1_ ()    `/ () 12 1_ |>", new LeetDictionary() );
		assertEquals("hello world", md.decoder(md.getMsg()));
	}

}