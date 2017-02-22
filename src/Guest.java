import java.util.Date;

public class Guest extends Card {
	
	Date issueData;
	
	public Guest() {
		pinCode = 9999;
		issueData = new Date();
	}

	@Override
	boolean checkPIN(int pinCode) {
		Date today = new Date();
		int daysDifference = (int)((today.getTime() - issueData.getTime()) / (1000 * 60 * 60 * 24));
		
		if(pinCode == 9999 && !isBlocked() && daysDifference <=7) {
			return true;
		}
		return false;
	}

}
