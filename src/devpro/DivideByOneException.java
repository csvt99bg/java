package devpro;

public class DivideByOneException extends Exception {
	String message; // intance 
	
	public DivideByOneException(String msg) {
		this.message = msg;
	}
	
}
