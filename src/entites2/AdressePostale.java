package entites2;

public class AdressePostale {

	public int numRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int numRue,String libelleRue, int codePostal, String ville){
		this.numRue = numRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
}
