package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();


		Personne pers1 = new Personne();
		pers1.name = "Lerouvillois";
		pers1.firstName = "Valentin";
		pers1.adressePostale = adr1;
		
		Personne pers2 = new Personne();
		pers2.name = "Lerouvillois";
		pers2.firstName = "Valentin";
		pers2.adressePostale = adr2;
		


	}

}
