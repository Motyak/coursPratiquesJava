public class Main {

	public static void main(String[] args) {

		int f0 = Fonctions.factoriel(0); // 1
		int f4 = Fonctions.factoriel(4); // 24
		int f7 = Fonctions.factoriel(7); // 5040

		System.out.printf(
		        "f0 -> %d %n"
		      + "f4 -> %d %n"
		      + "f7 -> %d %n"
		, f0, f4, f7);

	}

}
