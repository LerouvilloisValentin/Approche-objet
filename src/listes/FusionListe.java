package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Rouge");

		List<String> liste2 = new ArrayList<>();
		liste1.add("Blanc");
		liste1.add("Bleu");
		liste1.add("Orange");

		List<String> liste3 = new ArrayList<>();

		for (String element : liste1) {
			liste3.add(element);
		}

		for (String element : liste2) {
			liste3.add(element);
		}
		System.out.println(liste3);
	}

}
