package entites;


public class TestAdressePostale {
	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();
		
		adr1.numRue = 1823;
		adr1.libelleRue= "route de l'adoisière";
		adr1.codePostal = 61250;
		adr1.ville= "Heloup";
		
		adr2.numRue = 5;
		adr2.libelleRue= "route de bretagne";
		adr2.codePostal = 35000;
		adr2.ville= "Rennes";
		

	}

}
