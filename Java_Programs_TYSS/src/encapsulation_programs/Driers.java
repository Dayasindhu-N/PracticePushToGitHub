package encapsulation_programs;

public class Driers {
	public static void main(String[] args) {
		Bank b1=new Bank("Asit", 3625.235, "SINJ69554", "AHSIU", 754858554);
		System.out.println(b1.getCname());
		b1.setCname("Arjit");
		System.out.println(b1.getCname());
		System.out.println(b1.getAccNo());
		System.out.println(b1.getBal());
		System.out.println(b1.getIfscCode());
		System.out.println(b1.getBranch());
		b1.setBranch("HUHSHJ");
		System.out.println(b1.getBranch());
	}
}
