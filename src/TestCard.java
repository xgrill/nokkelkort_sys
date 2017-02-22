import java.util.ArrayList;

public class TestCard {
	public static void main(String []args) {
		
		ArrayList<Card> cardArray = new ArrayList<>();
		
		Card c1 = new Employee();
		Card c2 = new Guest();
		
		cardArray.add(c1);
		cardArray.add(c2);
		
		for (Card card : cardArray) {
			System.out.println(card);
			System.out.println("Code 1234 is " + (card.checkPIN(1234) ? "valid": "invalid"));
			System.out.println("Code 9999 is " + (card.checkPIN(9999) ? "valid": "invalid"));
		}
		
	}

}
