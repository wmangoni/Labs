package MorseDecoder;

public class Dicionario {
	private String code;
	
	public String encode(String ch) {
		this.setCode(charToCode(ch));
		return code;
	}
	public String decode(String ch) {
		this.setCode(codeToChar(ch));
		return code;
	}
	
	private String charToCode(String st) {
		switch(st) {
			case "a": return "._";
			case "b": return "_...";
			case "c": return "_._.";
			case "d": return "_..";
			case "e": return ".";
			case "f": return ".._.";
			case "g": return "__.";
			case "h": return "....";
			case "i": return "..";
			case "j": return ".___";
			case "k": return "_._";
			case "l": return "._..";
			case "m": return "__";
			case "n": return "_.";
			case "o": return "___";
			case "p": return ".__.";
			case "q": return "__._";
			case "r": return "._.";
			case "s": return "...";
			case "t": return "_";
			case "u": return ".._";
			case "v": return "..._";
			case "x": return "_.._";
			case "y": return "_.__";
			case "w": return ".__";
			case "z": return "__..";
			case "1": return ".____";
			case "2": return "..___";
			case "3": return "...__";
			case "4": return "...._";
			case "5": return ".....";
			case "6": return "_....";
			case "7": return "__...";
			case "8": return "___..";
			case "9": return "____.";
			case "0": return "_____";
		}
		return "";
	}
	
	private String codeToChar(String st) {
		switch(st) {
			case "._": return "a";
			case "_...": return "b";
			case "_._.": return "c";
			case "_..": return "d";
			case ".": return "e";
			case ".._.": return "f";
			case "__.": return "g";
			case "....": return "h";
			case "..": return "i";
			case ".___": return "j";
			case "_._": return "k";
			case "._..": return "l";
			case "__": return "m";
			case "_.": return "n";
			case "___": return "o";
			case ".__.": return "p";
			case "__._": return "q";
			case "._.": return "r";
			case "...": return "s";
			case "_": return "t";
			case ".._": return "u";
			case "..._": return "v";
			case "_.._": return "x";
			case "_.__": return "y";
			case ".__": return "w";
			case "__..": return "z";
			case ".____": return "1";
			case "..___": return "2";
			case "...__": return "3";
			case "...._": return "4";
			case ".....": return "5";
			case "_....": return "6";
			case "__...": return "7";
			case "___..": return "8";
			case "____.": return "9";
			case "_____": return "0";
		}
		return "";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
