package phrasOMat;

class PhrasOMat {
	public static void main(String args[]) {
		 String[] wortListEins = {
				"verlässliche",
				"erfolgsorinetierte",
				"verteilte",
				"zielgerichtete"
		};

		String[] wortListeZwei = {
				"Out-of-the-Box-",
				"kraftvolle ",
				"Multi-Tier-",
				"kooperative ",
				"B2B-"
		};

		String[] wortListeDrei = {
				"Schicht",
				"Vision",
				"Mission",
				"Strategie",
				"Lösung"
		};

		int einsLength = wortListEins.length;
		int zweiLength = wortListeZwei.length;
		int dreiLength = wortListeDrei.length;

		int rand1 = (int) (Math.random() * einsLength);
		int rand2 = (int) (Math.random() * zweiLength);
		int rand3 = (int) (Math.random() * dreiLength);


		String phrase = wortListEins[rand1]+ " " + wortListeZwei[rand2] + wortListeDrei[rand3];

		System.out.println(phrase);
	}
}