package assignmentsVMT1;

public class User {
	private String uname;
	private String uemail;
	private String upassword;
	private int uage;

	public void setuname(String uname) {
		this.uname = uname;
	}

	public void setuemail(String uemail) {
		this.uemail = uemail;
	}

	public void setupassword(String upassword) {
		this.upassword = upassword;
	}

	public void setuage(int uage) {
		this.uage = uage;
	}

	public String getuname() {
		return uname;
	}

	public String getuemail() {
		return uemail;
	}

	public String getupassword() {
		return upassword;
	}

	public int getuage() {
		return uage;
	}

	public String toString() {
		return "[ User Name: " + uname + ", User Age: " + uage + ", User Email: " + uemail + "]";
	}
}