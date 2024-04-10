package Interface;

public class Rectangle {


	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

	public double perimetreRectangle() {
		return 2*(longueur*largeur);
	}
	
	public double surfaceRectangle() {
		return longueur*largeur;
	}
}
