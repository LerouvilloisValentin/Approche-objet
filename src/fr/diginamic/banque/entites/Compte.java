package fr.diginamic.banque.entites;

public class Compte {

	String num;
	int solde;
	
	Compte(String num, int solde){

		this.num = num;
		this.solde = solde;
	}

	
	@Override
	public String toString() {
		return "Compte numCompte=" + num+ ", solde=" + solde;
	}



	public String getNumCompte() {
		return num;
	}

	public void setNumCompte(String numCompte) {
		this.num= numCompte;
	}


	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public static void main(String[] args) {
	

	}

}
