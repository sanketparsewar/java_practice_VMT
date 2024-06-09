package assignmentsVMT1.customexceptions;

public class InvalidPasswordException extends RuntimeException {
	private String msg = "Invalid Password!!! ";
	public InvalidPasswordException(){}
	public InvalidPasswordException(String msg){
		this.msg=msg;
	}
	public String toString() {
		return "InvalidPasswordException: "+msg;
	}
}
