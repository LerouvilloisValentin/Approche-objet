package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle cercle1 = new Cercle(2);
		Cercle cercle2 = new Cercle(5);

		double rayon = CercleFactory.returnCercle(2);
		System.out.println(cercle1);
		System.out.println(cercle2);
		System.out.println(rayon);

	}

}
