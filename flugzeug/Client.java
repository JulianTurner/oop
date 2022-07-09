package flugzeug;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		Flugzeug flugzeug = client.meldeFlugzeugZurLandung();
		client.vergebeLandebahnAnFlugzeug(flugzeug);
		client.vergebeParkstelleAnFlugzeug(flugzeug);
		client.meldeFlugzeugGelandet(flugzeug);
		client.vergebeStartbahnAnFlugzeug(flugzeug);
		client.meldeFlugzeugGestartet(flugzeug);
	}

	public void meldeFlugzeugGelandet(Flugzeug flugzeug) {
		String istzeitLandung = Abfrage.abfrageString("Geben Sie die Istzeit der Landung ein:");
		flugzeug.meldeGelandet(istzeitLandung);
		flugzeug.print();
	}

	public void meldeFlugzeugGestartet(Flugzeug flugzeug) {
		String istzeitStart = Abfrage.abfrageString("Geben Sie die Istzeit des Starts ein:");
		flugzeug.meldeGestartet(istzeitStart);
		flugzeug.print();
	}

	public Flugzeug meldeFlugzeugZurLandung() {
		String typ = Abfrage.abfrageString("Geben Sie den Flugzeug Typ ein:");
		String fluggesellschaft = Abfrage.abfrageString("Geben Sie die Fluggesellschaft ein:");
		String sollzeitLandung = Abfrage.abfrageString("Geben Sie die Sollzeit der Landung ein:");
		Flugzeug flugzeug = new Flugzeug(typ, fluggesellschaft, sollzeitLandung);
		flugzeug.print();
		return flugzeug;
	}

	public void vergebeLandebahnAnFlugzeug(Flugzeug flugzeug) {
		int landebahn = Abfrage.abfrageInt("Geben Sie die Landebahnnummer ein:");
		flugzeug.vergebeLandebahn(landebahn);
		flugzeug.print();
	}

	public void vergebeParkstelleAnFlugzeug(Flugzeug flugzeug) {
		String inWerft = Abfrage.abfrageString("Soll das Flugzeug in die Werft verlegt werden? (j/n)");
		if (inWerft.equals("j")) {
			flugzeug.vergebeParkstelle("Werft");
		} else {
			String aufSeparatesParkfeld = Abfrage
					.abfrageString("Soll das Flugzeug auf ein separates Parkfeld verlegt werden? (j/n)");
			if (aufSeparatesParkfeld.equals("j")) {
				flugzeug.vergebeParkstelle("separates Parkfeld");
			} else {
				int parkposition = Abfrage.abfrageInt("Geben Sie die Parkposition ein:");
				flugzeug.vergebeParkstelle("Parkposition " + parkposition);
			}
		}
		flugzeug.print();
	}

	public void vergebeStartbahnAnFlugzeug(Flugzeug flugzeug) {
		int startbahn = Abfrage.abfrageInt("Geben Sie die Startbahn ein:");
		String sollzeitStart = Abfrage.abfrageString("Geben Sie die Sollzeit fuer den Start ein:");
		flugzeug.vergebeStartbahn(startbahn, sollzeitStart);
		flugzeug.print();
	}
}