package MorseDecoder;

public class MorseDecoder {
	
	private String msg;
	private Dicionario dc;
	
	public MorseDecoder(String msg) {
		dc = new Dicionario(); 
		this.setMsg(msg);
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return this.msg;
	}
	public String encoder(String msg) {
		msg = msg.toLowerCase();
		String[] palavras = msg.split(" ");
		String[] letras = null;
		String result = "";
		for (String string : palavras) {
			letras = string.split("");
			for (String str : letras) {
				result += dc.encode(str) + " ";
			}
			result += "   ";
		}
		return result.substring( 0, result.length() - 4 );
	}
	public String decoder(String msg) {
		String[] palavras = msg.split("   ");
		String[] letras = null;
		String result = "";
		for (String string : palavras) {
			letras = string.split(" ");
			for (String str : letras) {
				result += dc.decode(str);
			}
			result += " ";
		}
		return result.substring( 0, result.length() - 1 );
	}
	
}
