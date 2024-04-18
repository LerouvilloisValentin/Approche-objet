package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstsRegionPop {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> recensement = Files.readAllLines(path);

		recensement.remove(0);
		HashMap<String, Integer> listRegion = new HashMap<>();

		for (String ville : recensement) {
			String[] tokens = ville.split(";");
			String nameRegion = tokens[1];

			String populations = tokens[9].trim().replaceAll(" ", "");
			int populationTotal = Integer.parseInt(populations);

			// Vérifier si la région est présente dans la map
			if (listRegion.containsKey(nameRegion)) {
				// Si oui, ajouter la population de la ville à la population existante de la
				// région
				listRegion.put(nameRegion, listRegion.get(nameRegion) + populationTotal);
			} else {
				// Si non, initialiser la population de la région avec la population de la ville
				listRegion.put(nameRegion, populationTotal);
			}
		}

		List<Map.Entry<String, Integer>> newListRegion = new ArrayList<>(listRegion.entrySet());
		// trie de la région la plus grande à la plus petite
		newListRegion.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		System.out.println("Les 10 régions les plus peuplées :");
		int count = 0;
		for (Map.Entry<String, Integer> listRegionSorted : newListRegion) {
			if (count >= 10) {
				break;
			}
			System.out.println(
					listRegionSorted.getKey() + " - Population : " + listRegionSorted.getValue() + " habitants");
			count++;
		}


	}
}
