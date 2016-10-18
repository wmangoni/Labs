package MorseDecoder;

public class MorseDecoderTestDrive {

	public static void main(String[] args) {
		MorseDecoder md = new MorseDecoder("Hello World");
		System.out.println(md.encoder(md.getMsg()));
		System.out.println(md.decoder(".... . ._.. ___    .__ ___ ._. ._.. _.."));
	}

}