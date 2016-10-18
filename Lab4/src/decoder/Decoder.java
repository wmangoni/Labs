package decoder;

public class Decoder {
	private String msg;
	private Dictionary dc;
	
	public Decoder(String msg, Dictionary d) {
		dc = d; 
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
		for (String palavra : palavras) {
			letras = palavra.split("");
			for (String letra : letras) {
				result += dc.encode(letra) + " ";
			}
			result += "   ";
		}
		return result.trim();
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
		return result.trim();
	}
}
