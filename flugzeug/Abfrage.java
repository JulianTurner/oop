package flugzeug;

public class Abfrage {
	public static int abfrageInt(String frage) {
		try {
			int zahl = Integer.parseInt(abfrageString(frage));
			if (zahl < 0)
				throw new NumberFormatException("");
			return zahl;
		} catch (NumberFormatException e) {
			System.out.println("Bitte eine gueltige Zahl eingeben");
			return abfrageInt(frage);
		}
	}

	public static String abfrageString(String frage) {
		try {
			System.out.print(frage + " ");
			java.util.Scanner eingabe = new java.util.Scanner(System.in);
			return eingabe.nextLine();
			// return (new java.util.Scanner (System.in)).nextLine();
		} catch (Exception e) {
			return "";
		}
	}
}