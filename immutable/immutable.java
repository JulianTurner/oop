package immutable;

public class immutable {
	public static void main(String[] args) {
		String str1 = "w3point";
		String str2 = "w3point";
		str1.concat(".com");

		System.out.println(str1);
		System.out.println(str2);

		str1 = str1.concat(".com");

		System.out.println(str1);
		System.out.println(str2);
	}
}
