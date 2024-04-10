package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double recette = Theatre.subscribe(50, 40, 10, i);
			System.out.println(recette);
		}

	}

}
