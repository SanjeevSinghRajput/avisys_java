package basic;

public class SwitchMonthOfExample {

	public static void main(String[] args) {
		// specifying month number
		int month = 12;
		
		String monthOfString = "";
		
		switch (month) {
		// case statement within the switch block
		case 1:
			monthOfString = "1-January";
			break;

		case 2:
			monthOfString = "2-February";
			break;

		case 3:
			monthOfString = "3-March";
			break;

		case 4:
			monthOfString = "4-April";
			break;

		case 5:
			monthOfString = "5-May";
			break;

		case 6:
			monthOfString = "6-June";
			break;

		case 7:
			monthOfString = "7-July";
			break;

		case 8:
			monthOfString = "8-Augst";
			break;

		case 9:
			monthOfString = "9-September";
			break;

		case 10:
			monthOfString = "10-October";
			break;

		case 11:
			monthOfString = "11-November";
			break;

		case 12:
			monthOfString = "12-December";
			break;

		default:
			System.out.println("Invalid Month!");

		}

		// Printing Month of the given number
		System.out.println(monthOfString);

	}

}
