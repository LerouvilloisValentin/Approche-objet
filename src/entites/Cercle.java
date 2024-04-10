package entites;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle Perimetre = " + perimetreCercle() + " Cercle Surface = " + surfaceCercle();
	}

	public double perimetreCercle() {
		return 2 * Math.PI * rayon;
	}

	public double surfaceCercle() {
		return Math.PI * rayon * rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
