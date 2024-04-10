package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte("115", 245);
//		System.out.println(compte);
		CompteTaux cptTaux = new CompteTaux("hello", 278, 2);
//		System.out.println(cptTaux);

		Compte[] array = { compte, cptTaux };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} 
	}
}
