package decoder;

public interface Dictionary {
	public String encode(String ch);
	public String decode(String ch);
	public String charToCode(String st);
	public String codeToChar(String st);
	public String getCode();
	public void setCode(String code);
	public void defineMap();
}
