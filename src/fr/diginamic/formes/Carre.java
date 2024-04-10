package fr.diginamic.formes;

public class Carre extends Rectangle {

	private double cote;

	public Carre(double cote) {
		super(cote, cote);
	}

	public void calculerSurface() {
		double surface = cote*cote;
		System.out.println("Surface du carre : " + surface);
	}

	public void calculerPerimetre() {
		double perimetre = 2 * cote*cote;
		System.out.println("Périmètre du carre : " + perimetre);
	}

}
