package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe", 1), ASIE("Asie", 2), AFRIQUE("Afrique", 3), AMERIQUE("AMERIQUE", 4),OCEANIE("Océanie", 5);

	private final String name;
	private final int numeroOrdre;

	private Continent( String name, int numeroOrdre) {
		this.name = name;
		this.numeroOrdre = numeroOrdre;
	}


	public String getName(String name) {
		return name;
	}

	 int getNumeroOrdre() {
		return numeroOrdre;
	}
}
