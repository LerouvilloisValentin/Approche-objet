package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> arrayDouble = new HashSet<>();
		arrayDouble.add(1.5);
		arrayDouble.add(8.25);
		arrayDouble.add(-7.32);
		arrayDouble.add(13.3);
		arrayDouble.add(-12.45);
		arrayDouble.add(48.5);
		arrayDouble.add(0.01);
		
		double smallNumber = Double.MIN_VALUE;
		
		for(double num : arrayDouble) {
			if(smallNumber < num)
				smallNumber = num;
		}
		System.out.println(smallNumber);
		
	}

}
