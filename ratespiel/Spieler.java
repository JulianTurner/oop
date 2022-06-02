package ratespiel;

public class Spieler {
	private int zahl = 0;

	public void raten()
	{
		zahl = (int) (Math.random() * 10);
		System.out.println("Ich tippe auf die Zahl: " + zahl);
	}

	public int getZahl()
	{
		return zahl;
	}
}

