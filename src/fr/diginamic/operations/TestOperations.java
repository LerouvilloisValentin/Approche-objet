package fr.diginamic.operations;

public class TestOperations {

	public static void main(String[] args) {
		double calcul1 = Operations.calcul(5,3,'+');
		double calcul2 =Operations.calcul(5.8,3,'-');
		double calcul3 =Operations.calcul(5.8,3,'*');
		double calcul4 =Operations.calcul(5.8,3,'/');
		
		System.out.println(calcul1);
		System.out.println(calcul2);
		System.out.println(calcul3);
		System.out.println(calcul4);
	}

}
