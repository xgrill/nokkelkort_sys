
public abstract class Card {
	
	String firstName;
	String lastName;
	int pinCode;
	int cardNr;
	boolean accessCode;
	static int card = 1;
	
	public Card() {
		firstName = "Lille";
		lastName = "Grille";
		pinCode = 2015;
		cardNr = card;
		card++;
		accessCode = false;
	}
	
	String getName() {
		return firstName + " " + lastName;
	}
	
	abstract boolean checkPIN(int pinCode);	
	
	boolean isBlocked() {
		return accessCode;
	}
	
	@Override
	public String toString() {
		return "Card [Name= " + firstName + " " + lastName + ", PINcode= " + pinCode + ", cardnumber= " + cardNr
				+ ", accesscode= " + accessCode + "]";
	}

}
