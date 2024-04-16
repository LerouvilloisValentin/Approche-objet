package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		String result = "";
		for (int i =0; i<100000; i++) {
//			builder.append(i).append("");
			result+= i + "";
		}

//		System.out.println(builder.toString());
		long fin = System.currentTimeMillis();
		System.out.println("temps écoulé :" + (fin - debut));
	}

}
