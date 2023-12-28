package inheritance_programs;

public class ThisCallStmt {
	public ThisCallStmt() {
		this(10);
		System.out.println("Constructor-1");
	}
	

	public ThisCallStmt(int a) {
		System.out.println("Constructor-2");
		System.out.println(a);
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ThisCallStmt t1=new ThisCallStmt();
	}

}
