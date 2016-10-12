package MorseDecoder;

public class MorseDecoder {
	
	private String msg;
	private String code;
	
	public MorseDecoder(String msg) {
		this.setMsg(msg);
		this.decoder(this.getMsg());
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return this.msg;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return this.code;
	}
	private void decoder(String msg) {
		String[] split = msg.split(" ");
		for (String string : split) {
			string.toUpperCase();
		}
	}
	
}
