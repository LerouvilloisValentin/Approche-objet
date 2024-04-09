package entites;

import entites2.AdressePostale;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		
		AdressePostale adr1 = new AdressePostale(4,"rue",61250, "heloup");
		Personne pers1 = new Personne("lerouvillois", "Valentin", new AdressePostale(4,"boule",85,"Ranes") );

//		pers1.displayName();
//		pers1.setName("babou");
//		pers1.displayName();
		pers1.getAdresse();
		System.out.println(pers1);
//		pers1.setAdresse(new AdressePostale(5,"boulevard",85000,"rennes"));
	}

}
