package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> pays = new HashSet<>();
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");
		
		String wordHigh="";
		for(String element : pays) {
			if(element.length() >wordHigh.length()) {
				wordHigh = element;
			}
		}
		System.out.println(wordHigh);
		pays.remove(wordHigh);
		
		System.out.println(pays);
	}

}
