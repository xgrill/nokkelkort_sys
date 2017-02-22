
public abstract class TheCard {
	
	String firstName;
	String lastName;
	int pinCode;
	int cardNr;
	boolean accessCode;
	static int card = 1;
	
	public TheCard() {
		firstName = "Lille";
		lastName = "Grille";
		pinCode = 2015;
		cardNr = card;
		card++;
		accessCode = false;
	}
	
	public int compareTo(TheCard r) {
		if (this.lastName.compareTo(r.firstName) != 0)
			return -1;
		return this.firstName.compareTo(r.firstName);
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
