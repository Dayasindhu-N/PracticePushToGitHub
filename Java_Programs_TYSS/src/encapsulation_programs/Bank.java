package encapsulation_programs;

public class Bank {
	private String cname;
	private double bal;
	private String ifscCode;
	private String branch;
	private long accNo;
	public Bank(String cname, double bal, String ifscCode, String branch, long accNo) {
		super();
		this.cname = cname;
		this.bal = bal;
		this.ifscCode = ifscCode;
		this.branch = branch;
		this.accNo = accNo;
	}
	//getter() for cname
	public String getCname() {
		return this.cname;
	}
	//setter() for cname
	public void setCname(String cname) {
		this.cname = cname;
	}
	//getter() for bal
	public double getBal() {
		return this.bal;
	}
	//getter() for ifscCode
	public String getIfscCode() {
		return this.ifscCode;
	}
	//getter() for branch
	public String getBranch() {
		return this.branch;
	}
	//setter() for branch
	public void setBranch(String branch) {
		this.branch = branch;
	}
	//getter() for account Number
	public long getAccNo() {
		return this.accNo;
	}
}