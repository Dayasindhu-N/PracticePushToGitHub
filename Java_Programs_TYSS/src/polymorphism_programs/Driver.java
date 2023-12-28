package polymorphism_programs;

class Card{
	void makePayment() {
		System.out.println("Making payment through card");
	}
}

class CreditCard extends Card{
	void makePayment() {
		System.out.println("Making payment through Credit card");
	}
}

class DebitCard extends Card{
	void makePayment() {
		System.out.println("Making payment through Debit card");
	}
}

class Swipe{
	public void swippingMachine(Card c) {
		c.makePayment();
	}
}

public class Driver {

	public static void main(String[] args) {
		CreditCard c1=new CreditCard();
		Swipe s1=new Swipe();
		s1.swippingMachine(c1);
		
		DebitCard d1=new DebitCard();
		s1.swippingMachine(d1);
		
		Card c2=new Card();
		s1.swippingMachine(c2);
	}
}