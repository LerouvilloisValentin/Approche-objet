package entites;

import entites2.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(4, "rue",61250, "heloup");	
		System.out.println(adr1);
		adr1.getLibelleRue();


	}

}
