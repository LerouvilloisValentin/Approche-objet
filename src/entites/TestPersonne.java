package entites;

import entites2.AdressePostale;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		
		AdressePostale adr1 = new AdressePostale(4,"rue",61250, "heloup");
		Personne pers1 = new Personne("lerouvillois", "valentin", adr1 );
		System.out.println(pers1.adresse.numRue);


	}

}
