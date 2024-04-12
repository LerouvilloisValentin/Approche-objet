package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListString {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.addAll(Arrays.asList("Nice", "Carcassone", "Narbonne", "lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		String motLePlusLong = "";

		for (String mot : array) {
			if (mot.length() > motLePlusLong.length()) {
				motLePlusLong = mot;
			}
		}
		  for (int i = 0; i < array.size(); i++) {
	            String ville = array.get(i);
	            array.set(i, ville.toUpperCase());
	        }
		  
		  Iterator<String> iterator = array.iterator();
		  while(iterator.hasNext()) {
			  String ville = iterator.next();
			  if(ville.startsWith("N")) {
				  iterator.remove();
			  }
		  }
		  System.out.println(array);
		  
	}
	

}
