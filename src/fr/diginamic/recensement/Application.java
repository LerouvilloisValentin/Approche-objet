package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> recensement = Files.readAllLines(path);
		ArrayList<Ville> villes = new ArrayList<Ville>();

		recensement.remove(0);
		ArrayList<Integer> populationsParRegion = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Demandez moi la population d'une ville:");
		String villeSaisie = scanner.nextLine();

		for (String ligne : recensement) {
			String[] tokens = ligne.split(";");

			String name = tokens[6];
			String codeDepartment = tokens[2];
			String nameRegion = tokens[1];
			int codeRegion = Integer.parseInt(tokens[0]);

			String population = tokens[9].trim().replaceAll(" ", "");
			int popTot = Integer.parseInt(population);

			if (name.equals(villeSaisie)) {
				System.out.println("La population de " + name + " est de " + popTot + " habitants");
				scanner.close();
			}

		}
	}
}
