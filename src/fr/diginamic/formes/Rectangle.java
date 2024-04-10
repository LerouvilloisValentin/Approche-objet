package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double largeur;
	private double longueur;

	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur=longueur;
	}

	public void calculerSurface() {
		double surface = largeur*longueur*2;
		System.out.println("Surface du Rectangle : " + surface);
	}

	public void calculerPerimetre() {
		double perimetre = largeur*longueur;
		System.out.println("Périmètre du Rectangle: " + perimetre);
	}

}
