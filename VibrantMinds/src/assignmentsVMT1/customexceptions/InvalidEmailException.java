package assignmentsVMT1.customexceptions;

public class InvalidEmailException extends RuntimeException {
	private String msg = "Invalid Email!!! ";
	public InvalidEmailException(){}
	public InvalidEmailException(String msg){
		this.msg=msg;
	}
	public String toString() {
		return "InvalidEmailException: "+msg;
	}
}
