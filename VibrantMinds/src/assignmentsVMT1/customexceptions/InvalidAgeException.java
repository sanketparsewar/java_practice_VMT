package assignmentsVMT1.customexceptions;

public class InvalidAgeException extends RuntimeException{
	private String msg = "Invalid Age!!! ";
	public InvalidAgeException(){}
	public InvalidAgeException(String msg){
		this.msg=msg;
	}
	public String toString() {
		return "InvalidAgeException: "+msg;
	}
}
