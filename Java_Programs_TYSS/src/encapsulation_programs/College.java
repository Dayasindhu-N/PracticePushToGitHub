package encapsulation_programs;

class College {
	private String sname;
	private int regNo;
	private int sem;
	private int noOfBacklogs;
	private String branch;
	public College(String sname, int regNo, int sem, int noOfBacklogs, String branch) {
		super();
		this.sname = sname;
		this.regNo = regNo;
		this.sem = sem;
		this.noOfBacklogs = noOfBacklogs;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "College [Student Name=" + this.sname + ", Registration Number=" + this.regNo + ", Semester=" + this.sem + ", Number of Backlogs=" + this.noOfBacklogs
				+ ", Branch=" + this.branch + "]";
	}
	public String getSname() {
		return this.sname;
	}
	public int getRegNo() {
		return this.regNo;
	}
	public int getSem() {
		return this.sem;
	}
	public int getNoOfBacklogs() {
		return this.noOfBacklogs;
	}
	public String getBranch() {
		return this.branch;
	}
}