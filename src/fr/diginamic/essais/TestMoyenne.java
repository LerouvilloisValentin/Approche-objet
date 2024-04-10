package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        double[] myArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        CalculMoyenne moyenneCalculator = new CalculMoyenne(myArray);
//        double result = moyenneCalculator.add();
//        System.out.println("Deuxième élément du tableau : " + result);
    }
}
