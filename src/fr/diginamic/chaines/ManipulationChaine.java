package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		char premierSymbole= (char) chaine.indexOf(';');
		String substring = chaine.substring(0, 5);
		System.out.println("premier caractère :" + premierCaractere);
		System.out.println("premier caractère :" + chaine.length());
		System.out.println("index caractère :" + premierSymbole);
		System.out.println("portion Caractère :" + substring);
	}

}
