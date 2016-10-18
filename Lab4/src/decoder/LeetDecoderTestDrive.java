package decoder;

public class LeetDecoderTestDrive {

	public static void main(String[] args) {
		Decoder md = new Decoder( "Hello World", new MorseDictionary() );
		System.out.println(md.encoder(md.getMsg()));
		System.out.println(md.decoder(".... . ._.. ._.. ___    .__ ___ ._. ._.. _.."));
		
		Decoder md2 = new Decoder( "Hello World", new LeetDictionary() );
		System.out.println(md2.encoder(md2.getMsg()));
		System.out.println(md2.decoder("# & 1_ 1_ ()    `/ () 12 1_ |>"));
	}

}
