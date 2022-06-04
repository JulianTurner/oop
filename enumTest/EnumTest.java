package enumTest;

/**
 * EnumTest
 */
public class EnumTest {
	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public void tellLikeItIs() {
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are bad.");
				break;

			case FRIDAY:
				System.out.println("Firdays are better.");
				break;

			case SUNDAY:
				System.out.println("Sundays are good.");
				break;

			default:
				System.out.println("Midweek days are so-so.");
				break;
		}
	}

	public static void main(String[] args) {
		System.out.println("\nFolks, we got the following days to commants:");
		for (Day d : Day.values()) {
			System.out.println(d);
		}
		System.out.println("");

		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellLikeItIs();
		
	}
}