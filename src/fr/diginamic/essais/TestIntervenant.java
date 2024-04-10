package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

    public static void main(String[] args) {
  
        Salarie salarie = new Salarie("Lerouvillois", "Valentin", 2000, 80, 22);

  
        double salaire = salarie.getNumberOfDays()*salarie.getSalaryPerDay();
        System.out.println("Le salaire du salarié est : " + salaire);
    }

}
