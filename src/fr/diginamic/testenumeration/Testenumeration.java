package fr.diginamic.testenumeration;

public class Testenumeration {

	public static void main(String[] args) {
		for(Saison saison : Saison.values()) {
			System.out.println(saison);
		}
		Saison Eté = Saison.ETE;
		System.out.println(Eté);
		
//		 if (Saison.getName(this.name).equals(this.name)) {
//    
//             return saison;
//		 }
	}

}
