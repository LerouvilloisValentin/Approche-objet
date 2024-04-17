package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

    public static void main(String[] args) {
    	
        List<VilleContinent> villesContinent = new ArrayList<>();
        VilleContinent villeContinent1 = new VilleContinent("New York", 7500450, Continent.AMERIQUE);
        VilleContinent villeContinent2 = new VilleContinent("Paris", 2450450, Continent.EUROPE);
        VilleContinent villeContinent3 = new VilleContinent("Pékin", 9500450, Continent.ASIE);
        VilleContinent villeContinent4 = new VilleContinent("Moscou", 4500450, Continent.ASIE);
        VilleContinent villeContinent5 = new VilleContinent("Berlin", 3500450, Continent.EUROPE);
        VilleContinent villeContinent6 = new VilleContinent("Sydney", 1500450, Continent.OCEANIE);
		VilleContinent villeContinent7 = new VilleContinent("Sao Paulo", 8500450, Continent.AMERIQUE);
        VilleContinent villeContinent8 = new VilleContinent("Dakar", 2400450, Continent.AFRIQUE);

        villesContinent.add(villeContinent1);
        villesContinent.add(villeContinent2);
        villesContinent.add(villeContinent3);
        villesContinent.add(villeContinent4);
        villesContinent.add(villeContinent5);
        villesContinent.add(villeContinent6);
        villesContinent.add(villeContinent7);
        villesContinent.add(villeContinent8);

        for (VilleContinent villeContinent : villesContinent) {
            System.out.println(villeContinent);
        }
    }
}
