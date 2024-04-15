package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import maps.Employed;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, Employed> employedMap = new HashMap<>();
		employedMap.put("11", new Employed("Paul", 1750));
		employedMap.put("22", new Employed("Hicham", 1825));
		employedMap.put("41", new Employed("Yu", 2250));
		employedMap.put("05", new Employed("Ingrid", 2015));
		employedMap.put("09", new Employed("Chantal", 2418));

//		System.out.println(employedMap);

		HashMap<Integer, String> villeMap = new HashMap<>();
		villeMap.put(13, "Marseille");
		villeMap.put(34, "Montpellier");
		villeMap.put(44, "Nantes");
		villeMap.put(75, "Paris");
		villeMap.put(59, "Lille");
		villeMap.put(69, "Lyon");
		villeMap.put(33, "Bordeaux");

//		for (Map.Entry<Integer, String> ville : villeMap.entrySet()) {
//			System.out.println(ville.getKey() + " " + ville.getValue());
//		}
//		System.out.println(villeMap.size());

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.putAll(map1);
		map3.putAll(map2);
//		System.out.println(map3);

	}

}
