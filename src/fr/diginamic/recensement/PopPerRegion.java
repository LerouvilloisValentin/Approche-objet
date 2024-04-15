package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopPerRegion {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> recensement = Files.readAllLines(path);
		ArrayList<Ville> villes = new ArrayList<Ville>();

		recensement.remove(0);
		Scanner scanner = new Scanner(System.in);
		int populationTotaleRegion = 0; 
		boolean villeTrouve = false;
		
		System.out.println("Entrez le code de la région pour obtenir sa population:");

		String nameRegionSaisie = scanner.nextLine();
		for (String ville : recensement) {
			String[] tokens = ville.split(";");
			String nameRegion = tokens[1];

			String populations = tokens[9].trim().replaceAll(" ", "");
			int populationTotal = Integer.parseInt(populations);
			
			if (nameRegion.equals(nameRegionSaisie)) {
				populationTotaleRegion += populationTotal;
				villeTrouve = true;
	
		}
		}
			  if (villeTrouve) {
		            System.out.println("La population totale de la région " + nameRegionSaisie + " est de " + populationTotaleRegion
		                    + " habitants");
		        } else {
		            System.out.println("La région saisie n'existe pas.");
		        }

		scanner.close();
	}

}
