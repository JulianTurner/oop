package flugzeug;

public class Flugzeug {
	private static int anzahlFlugzeuge;
	private String fluggesellschaft;
	private String flugnummer;
	private String flugzeugtyp;
	private String istzeitLandung;
	private String istzeitStart;
	private int landebahn = -1;
	private String parkstelle;
	private String sollzeitLandung;
	private String sollzeitStart;
	private int startbahn = -1;
	private String status = "wartend";

	public Flugzeug(String flugzeugtyp, String fluggesellschaft, String sollzeitLandung) {
		// Anzahl der Flugzeuge um eins erhoehen, diese wird fuer die eindeutige
		// Flugnummer benoetigt
		anzahlFlugzeuge++;
		// Flugnummer aus Kuerzel und eindeutiger ID generieren
		flugnummer = erstelleKuerzel(fluggesellschaft) + " " + (anzahlFlugzeuge + 100);
		this.flugzeugtyp = flugzeugtyp;
		this.fluggesellschaft = fluggesellschaft;
		this.sollzeitLandung = sollzeitLandung;
	}

	private String erstelleKuerzel(String fluggesellschaft) {
		String kuerzel;
		// Das Kuerzel besteht aus den ersten beiden Zeichen der Fluggesellschaft.
		if (fluggesellschaft.length() < 2) {
			kuerzel = fluggesellschaft;
		} else {
			kuerzel = fluggesellschaft.substring(0, 2);
		}
		return kuerzel.toUpperCase();
	}

	public void meldeGelandet(String istzeitLandung) {
		this.istzeitLandung = istzeitLandung;
		status = "Geparkt";
	}

	public void meldeGestartet(String istzeitStart) {
		this.istzeitStart = istzeitStart;
		status = "Gestartet";
	}

	public void print() {
		System.out.print("Flugzeug " + flugnummer);
		System.out.println(" befindet sich im Status \'" + status + "\'.");
		System.out.print("Es ist vom Typ " + flugzeugtyp);
		System.out.println(" und gehoert der Fluggesellschaft " + fluggesellschaft + ".");
		// Nur Ausgeben wenn mindestens die Landebahn belegt wurde
		if (landebahn > 0) {
			System.out.println("Es wird verwendet/wurde verwendet:");
			System.out.println("- Landebahn " + landebahn);
			if (parkstelle != null) {
				System.out.println("- " + parkstelle);
			}
			if (startbahn > 0) {
				System.out.println("- Startbahn " + startbahn);
			}
		}
		System.out.println();
	}

	public void vergebeLandebahn(int landebahn) {
		this.landebahn = landebahn;
		status = "Landeanflug";
	}

	public void vergebeParkstelle(String parkstelle) {
		this.parkstelle = parkstelle;
		status = "Gelandet";
	}

	public void vergebeStartbahn(int startbahn, String sollzeitStart) {
		this.startbahn = startbahn;
		this.sollzeitStart = sollzeitStart;
		status = "Startvorbereitung";
	}

	public String getIstzeitLandung() {
		return istzeitLandung;
	}

	public String getIstzeitStart() {
		return istzeitStart;
	}

	public String getSollzeitLandung() {
		return sollzeitLandung;
	}

	public String getSollzeitStart() {
		return sollzeitStart;
	}
}