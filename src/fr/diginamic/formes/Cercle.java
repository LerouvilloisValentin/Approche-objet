package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public void calculerSurface() {
		double surface = Math.PI * rayon * rayon;
		System.out.println("Surface du cercle : " + surface);
	}

	public void calculerPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		System.out.println("Périmètre du cercle : " + perimetre);
	}

}
