package fr.diginamic.banque.entites;

public class TestOpération {

	public static void main(String[] args) {

		Operation[] array = new Operation[4];

		array[0] = new Credit("04/05/2022", 145, 4, 5);
		array[1] = new Credit("05/08/2022", 165, 4, 5);
		array[2] = new Debit("07/11/2022", 168, 4, 5);
		array[3] = new Debit("15/01/2023", 167, 4, 5);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}