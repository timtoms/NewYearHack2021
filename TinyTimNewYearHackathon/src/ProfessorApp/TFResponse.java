package ProfessorApp;
public enum TFResponse {
	
	YES ("Yes"),
	NO ("No"),
	NOANSWER ("");
	
	private String label;
	
	private TFResponse(String s) {
	
	this.label = s;
	}
	
	public String label() {
		return this.label;
	}
	
}