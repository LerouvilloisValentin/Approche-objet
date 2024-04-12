package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/code/java/ApprocheObject/recensement.csv");
		List<String> liste = Files.readAllLines(path);
		
		ArrayList<String> selection = new ArrayList<>();
		
	     for (int i = 0; i < liste.size(); i++) {
	            String ligne = liste.get(i);
	            if (i >= 0 && i <= 100) { // Include lines from 0 to 100
	                selection.add(ligne);
	            }
	        }
		Path pathDest = Paths.get("C:/code/java/ApprocheObject/recensement-firstLine.csv");
		Files.write(pathDest,selection);
	}

}
