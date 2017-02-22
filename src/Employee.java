import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee extends Card implements Constants {
	
	public GregorianCalendar issueData; 
	double hourlyWage;
	
	public Employee() {
		hourlyWage = 212.51;
		issueData = new GregorianCalendar();
	}
	
	@Override
	boolean checkPIN(int pinCode) {
		int day, month, year;
		int second, minute, hour;
		
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		
		if(pinCode!= 9999 && !isBlocked() && hour>=7 && hour<=17) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public void setFullName(String fullName) {
		String names[] = fullName.split("\\s+");
		firstName = names[0];
		lastName = names[1];
	}
	
	@Override
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public double calculateCredit() {
		return hourlyWage*4.10;
	}
	
	@Override
	public double calculateBonus() {
		GregorianCalendar date = new GregorianCalendar();
		int currentYear = date.get(Calendar.YEAR);
		int hiredYear = date.get(Calendar.YEAR);
		return (currentYear - hiredYear)*1.20;
	}

}
