package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstsVillePop {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> recensement = Files.readAllLines(path);

		recensement.remove(0);
		Scanner scanner = new Scanner(System.in);
		ArrayList<Ville> listVille= new ArrayList<>();

		for (String villes : recensement) {
			String[] tokens = villes.split(";");
			String nameVille= tokens[6];

			String populations = tokens[9].trim().replaceAll(" ", "");
			int populationTotal = Integer.parseInt(populations);

			Ville ville = new Ville(nameVille, populationTotal);

			listVille.add(ville);

		}

		Collections.sort(listVille, new ComparatorHabitant());

		System.out.println("Les 10 Départements les plus peuplées :");
		int count = 0;
		for (Ville listVilleSorted : listVille) {
			if (count >= 10) {
				break;
			}
			System.out.println(listVilleSorted.getName()+"  "+ listVilleSorted.getPopTot());
			count++;
		}

		scanner.close();
	}
}
