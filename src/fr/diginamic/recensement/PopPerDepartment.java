package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopPerDepartment {

	public static void main(String[] args) throws IOException{
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> recensement = Files.readAllLines(path);
		ArrayList<Ville> villes = new ArrayList<Ville>();

		recensement.remove(0);		
		Scanner scanner = new Scanner(System.in);
		int populationTotaleDepartement = 0; 

		System.out.println("Entrez le code du département pour obtenir sa population:");

		String codeDepartementSaisie = scanner.nextLine();
		for (String ville : recensement) {
			String[] tokens = ville.split(";");
	
	            String codeDepartment = tokens[2];
	            String populations = tokens[9].trim().replaceAll(" ", "");
	            int populationTotal = Integer.parseInt(populations);
	        
			if (codeDepartment.equals(codeDepartementSaisie)) {
				populationTotaleDepartement += populationTotal; 
										
			}
		}

		System.out.println("La population total45e du département " + codeDepartementSaisie + " est de "
				+ populationTotaleDepartement + " habitants");

		scanner.close();
	}

}
