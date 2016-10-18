package decoder;

import java.util.HashMap;
import java.util.Map;

public class LeetDictionary implements Dictionary {
	private String code;
	private Map<String, String> mapa = new HashMap<String, String>();
	
	public LeetDictionary() {
		defineMap();
	}

	public void defineMap(){
		mapa.put("a", "@");
		mapa.put("b", "|:");
		mapa.put("c", "[");
		mapa.put("d", "|>");
		mapa.put("e", "&");
		mapa.put("f", "Ph");
		mapa.put("g", "C-");
		mapa.put("h", "#");
		mapa.put("i", "!");
		mapa.put("j", "(/");
		mapa.put("k", "X");
		mapa.put("l", "1_");
		mapa.put("m", "|V|");
		mapa.put("n", "/V");
		mapa.put("o", "()");
		mapa.put("p", "|*");
		mapa.put("q", "(_,)");
		mapa.put("r", "12");
		mapa.put("s", "$");
		mapa.put("t", "+");
		mapa.put("u", "|_|");
		mapa.put("v", "\\/");
		mapa.put("x", "VV");
		mapa.put("y", ")(");
		mapa.put("w", "`/");
		mapa.put("z", "%");
		mapa.put("1", "1");
		mapa.put("2", "2");
		mapa.put("3", "3");
		mapa.put("4", "4");
		mapa.put("5", "5");
		mapa.put("6", "6");
		mapa.put("7", "7");
		mapa.put("8", "8");
		mapa.put("9", "9");
		mapa.put("0", "0");
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
