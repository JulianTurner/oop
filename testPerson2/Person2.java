package testPerson2;

public class Person2 {

	private int alter;

	public void print() {
		this.printSterne();
		System.out.println("Alter: " + this.alter);
		printSterne();
	}

	private void printSterne() {
		System.out.println("*****");
	}

	public void sezteAlter(int alt) {
		this.alter = alt;
	}
}
