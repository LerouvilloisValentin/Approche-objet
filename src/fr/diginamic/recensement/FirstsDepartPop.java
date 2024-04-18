package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstsDepartPop {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> recensement = Files.readAllLines(path);

		recensement.remove(0);

		ArrayList<Ville2> listDepartement = new ArrayList<>();

		for (String villes : recensement) {
			String[] tokens = villes.split(";");
			String codeDepartement = tokens[2];

			String populations = tokens[9].trim().replaceAll(" ", "");
			int populationTotal = Integer.parseInt(populations);

			Ville2 ville = new Ville2(codeDepartement, populationTotal);

			listDepartement.add(ville);

		}
		Collections.sort(listDepartement, new ComparatorHabitant2());

		System.out.println("Les 10 Départements les plus peuplées :");
		int count = 0;
		for (Ville2 listDepartementSorted : listDepartement) {
			if (count >= 10) {
				break;
			}
			System.out.println(listDepartementSorted);
			count++;
		}

	}
}
