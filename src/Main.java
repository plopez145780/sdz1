/**
 * Created by pierr on 05/07/2016.
 */
public class Main {

	public static void main(String[] args){
		System.out.println("Hello world");

		byte t;
		t = 64;
		short v = 32000;
		int tS = 156000000;
		long aN = 9460700000000000L;
		float pi = 3.14f;
		double nb = 2.0d;

		char carac = 'A';
		boolean bool = true;

		String text = "azerty";
		String text2 = new String();
		text2 = "qwerty";
		String text3 = new String("Clavier");

		String t1 = "1", t2 = new String("2"), t3 = "3";

		//en chiffre a virgule
		int i = 123;
		float j = (float)i;
		double k = (double)i;

		double m = 1.23;
		double n = 2.99999999;
		int mm = (int)m;
		int nn = (int)n;

		double nbre1 = 10;
		double nbre2 = 3;
		int resultat = (int)(nbre1 / nbre2);
		System.out.println("Le résultat est = " + resultat);

		int nbre1a = 3, nbre2a = 2;
		double resultata = nbre1a / nbre2a;
		System.out.println("Le résultat a est = " + resultata);

		int nbre1b = 3, nbre2b = 2;
		double resultatb = (double)(nbre1b / nbre2b);
		System.out.println("Le résultat b est = " + resultatb);

		int titi = 13;
		String toto = new String();
		toto = toto.valueOf(titi);

		//int tata = Integer.valueOf(toto).intValue();
		int tutu = Integer.valueOf(toto).intValue();

		int az = 12345;
		long er = (long)az;
		int ty = (int)er;

		double nombre = 1000000000000d; // cast en d
		double nombre1 = 1____000____000___000_000d; // cast en d
		int entier = 32_000;
		double monDouble = 12_34_56_78_89_10d; // cast en d
		double monDouble2 = 1234_5678_8910d;   // cast en d
		System.out.println(monDouble2);

		int entier1 = 255; //Peut s'écrire « int entier = 0xFF; »
		int entier2 = 0x14;
		System.out.println(entier2);
		int entier3 = 5112;

		int entier4 = 0b1111_1111; //Est équivalent à : « int entier = 255; »
		int entier5 = 0b1000_0000_0000; //Est équivalent à : « int entier = 2048; »
		int entier6 = 0b100000000000;
		System.out.println(entier5);

		i = 58;
		if(i < 100 && i > 100)
			System.out.println("Le nombre est bien dans l'intervalle.");
		else
			System.out.println("Le nombre n'est pas dans l'intervalle.");

		String chaine = "Bonjour";

		switch(chaine) {
			case "Bonjour":
				System.out.println("Bonjour monsieur !");
				break;
			case "Bonsoir":
				System.out.println("Bonsoir monsieur !");
				break;
			default:
				System.out.println("Bonjoir ! :p");
		}
		int x = 10, y = 20;
		int max = (x < y) ? y : x ; //Maintenant, max vaut 20

	}
}
