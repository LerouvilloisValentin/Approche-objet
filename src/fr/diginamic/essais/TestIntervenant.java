package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

//		double salaire = salarie.getNumberOfDays() * salarie.getSalaryPerDay();
//		System.out.println("Le salaire du salarié est : " + salaire);
//	}
	public static void main(String[] args) {

		Salarie salarie = new Salarie("Lerouvillois", "Valentin", 2000, 80, 22);
		Pigiste pigiste= new Pigiste("Lerouvillois", "Valentin", 2500, 100, 24);
		
		double salariePigiste = pigiste.getSalaire();
		System.out.println(salariePigiste);
		}


}
