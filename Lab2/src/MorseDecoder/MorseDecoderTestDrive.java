package MorseDecoder;

import java.util.StringTokenizer;

public class MorseDecoderTestDrive {

	public static void main(String[] args) {
		//MorseDecoder md = new MorseDecoder("hello world");
		StringTokenizer st = new StringTokenizer("this is a test");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }

	}

}
