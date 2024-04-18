package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private final String name;
	private final int numeroOrdre;

	/**
	 * @param name
	 * @param numeroOrdre
	 */
	private Saison(String name, int numeroOrdre) {
		this.name = name;
		this.numeroOrdre = numeroOrdre;
	}
	
//	public static Saison obtenirSaison(String name) {
//		for(Saison saison : values()) {
//			if (saison.getName().equals(name)) {
//				return saison;
//			}
//			return null;
//		}
//	}

	public String getName() {
		return name;
	}

	 int getNumeroOrdre() {
		return numeroOrdre;
	}
}
