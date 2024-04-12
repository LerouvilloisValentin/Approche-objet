package fr.diginamic.salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Intervenant salarie = new Salarie("Valentin","Lerouvillois",2500,4,5);
		Intervenant pigiste = new Pigiste("Val","Lerou",200,40,50);
		salarie.afficherDonnees("val","f",45);
		pigiste.afficherDonnees("pigiste", "pige", 12);
	}

}
