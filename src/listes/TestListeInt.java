package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		int sizee = array.size();
//		 System.out.println(sizee);
		int max = 0;
		for (int i = 0; i < array.size(); i++) {
			int element = array.get(i);
			if (element > max) {
				max = element;
			}
		}
//		 System.out.println(max);
		int min = 0;
		for (int i = 0; i < array.size(); i++) {
			int element = array.get(i);
			if (element < min) {
				min = element;
			}
		}
		array.remove(Integer.valueOf(min));
//		System.out.println(array);
		
		for (int i = 0; i < array.size(); i++) {
			int element= array.get(i);
			if(element<0) {
				array.get(i);
				System.out.println(i);
			}
		}

	}

}
