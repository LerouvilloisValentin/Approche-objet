package sets;

import java.util.HashSet;

public class TestHashetPays {

	public static void main(String[] args) {
		HashSet<Pays> pays = new HashSet<>();
		pays.add(new Pays("USA", 280457450, 76457));
		pays.add(new Pays("France", 68542158, 40879));
		pays.add(new Pays("Allemagne", 83845206, 48717));
		pays.add(new Pays("Uk", 183845206, 60717));
		pays.add(new Pays("Italie", 53845206, 38717));
		pays.add(new Pays("Japon", 126452875, 33823));

		String paysPibMax = null;
		int pibMax = 0;
		for (Pays element : pays) {
			if (element.getPibHab() > pibMax) {
				pibMax = element.getPibHab();
				paysPibMax = element.getName();
			}
		}
		System.out.println(paysPibMax + " " + pibMax);

	}

}
