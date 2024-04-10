package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void display(Forme forme) {
		forme.calculerPerimetre();
		forme.calculerSurface();
		return;
	}

	public static void main(String[] args) {
		Cercle cercle = new Cercle(2);
		Carre carre = new Carre(2);
		Rectangle rectangle = new Rectangle(2,2);
		
		display(cercle);
	}

}
