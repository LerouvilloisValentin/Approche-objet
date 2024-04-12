package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import listes.TestVilles;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> liste = Files.readAllLines(path);
		ArrayList<Ville> villes = new ArrayList<Ville>();
		System.out.println(villes);
		liste.remove(0);
		 for (String ligne : liste) {
			String[] tokens = ligne.split(";");
			String name = tokens[6];
			String codeDepartment = tokens[2];
			String nameRegion = tokens[1];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popTot = Integer.parseInt(population);
			
			if(popTot > 25000) {
				Ville ville = new Ville(name, codeDepartment, nameRegion,popTot);
				villes.add(ville);
			}
		}
		 
		 Collections.sort(villes);
		 for(Ville ville : villes) {
			 System.out.println(ville);
		 }

//	        Path pathDest = Paths.get("C:/code/java/ApprocheObject/recensement-new.csv");
//	        List<String> listeVilles = new ArrayList<>();
//	        for (Ville ville : villes) {
//	            String toString = ville.toString(); 
//	            listeVilles.add(toString);
//	        }
//	        Files.write(pathDest, listeVilles);
	
	
		 
    }
	}


