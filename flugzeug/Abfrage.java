package flugzeug;

import java.util.Scanner;


public class Abfrage {
	public static int abfrageInt(String frage) {
		try {
			int zahl = Integer.parseInt(abfrageString(frage));
			if (zahl < 0)
				throw new NumberFormatException("Zahl zu klein");
			return zahl;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Bitte eine gueltige Zahl eingeben");
			return abfrageInt(frage);
		}
	}

	public static String abfrageString(String frage) {
		try {
			System.out.print(frage + " ");
			Scanner eingabe = new Scanner(System.in);
			String eingabeString = eingabe.nextLine();
			eingabe.close();
			return eingabeString;
			// return (new java.util.Scanner (System.in)).nextLine();
		} catch (Exception e) {
			return "";
		}
	}
}