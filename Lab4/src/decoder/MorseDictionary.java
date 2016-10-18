package decoder;

import java.util.HashMap;
import java.util.Map;

public class MorseDictionary implements Dictionary {
	private String code;
	private Map<String, String> mapa = new HashMap<String, String>();
	
	public MorseDictionary() {
		defineMap();
	}
	
	@Override
	public String encode(String ch) {
		this.setCode(charToCode(ch));
		return code;
	}
	
	@Override
	public String decode(String ch) {
		this.setCode(codeToChar(ch));
		return code;
	}
	
	
	@Override
	public String charToCode(String st) {
		return mapa.get(st);
	}
	public void defineMap(){
		mapa.put("a", "._");
		mapa.put("b", "_...");
		mapa.put("c", "_._.");
		mapa.put("d", "_..");
		mapa.put("e", ".");
		mapa.put("f", ".._.");
		mapa.put("g", "__.");
		mapa.put("h", "....");
		mapa.put("i", "..");
		mapa.put("j", ".___");
		mapa.put("k", "_._");
		mapa.put("l", "._..");
		mapa.put("m", "__");
		mapa.put("n", "_.");
		mapa.put("o", "___");
		mapa.put("p", ".__.");
		mapa.put("q", "__._");
		mapa.put("r", "._.");
		mapa.put("s", "...");
		mapa.put("t", "_");
		mapa.put("u", ".._");
		mapa.put("v", "..._");
		mapa.put("x", "_.._");
		mapa.put("y", "_.__");
		mapa.put("w", ".__");
		mapa.put("z", "__..");
		mapa.put("1", ".____");
		mapa.put("2", "..___");
		mapa.put("3", "...__");
		mapa.put("4", "...._");
		mapa.put("5", ".....");
		mapa.put("6", "_....");
		mapa.put("7", "__...");
		mapa.put("8", "___..");
		mapa.put("9", "____.");
		mapa.put("0", "_____");
	}
	
	@Override
	public String codeToChar(String st) {
		for (Map.Entry<String, String> map : mapa.entrySet()) {
			if ( st.equals(map.getValue()) )
				return map.getKey();
		}
		return st;
	}
	
	@Override
	public String getCode() {
		return code;
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
	}
}
