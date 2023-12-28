package encapsulation_programs;

class Bank2{
	private double bal;
	private int pin=1234;
	double amt;
	public Bank2(double bal) {
		this.bal=bal;
	}
	public String getBalance(int pin) {
		if (pin==this.pin) {
			return "Balance: "+this.bal;
		} else {
			return "Invalid PIN";
		}
	}
	public void setDeposit(double amt) {
		if (amt>0) {
			this.bal+=amt;
			System.out.println("Deposited successfully");
		} else {
			System.out.println("Invalid amount");
		}
	}
	public void setWithdraw(double amt,int pin) {
		if (pin==this.pin) {
			if (amt>=this.bal && amt<0
					) {
				System.out.println("Invalid amount");
			} else {
				this.bal-=amt;
			}
		} else {
			System.out.println("Invalid PIN");
		}
		
	}
}

public class Driver2 {
	public static void main(String[] args) {
		Bank2 b2=new Bank2(23225.27);
		System.out.println(b2.getBalance(1234));
		b2.setDeposit(52332.23);
		System.out.println(b2.getBalance(1234));
		b2.setWithdraw(45454.23, 2525);
		System.out.println(b2.getBalance(1234));
		b2.setWithdraw(98558.23, 1234);
		System.out.println(b2.getBalance(1234));
		b2.setWithdraw(42256.12, 1234);
		System.out.println(b2.getBalance(1234));
	}
}