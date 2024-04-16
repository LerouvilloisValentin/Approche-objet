package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd à HH:mm:ss");
		Date d = new Date();
//		System.out.println(chaine);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016,4,19,23,59,30);
		d = calendar.getTime();
		String chaine = formateur.format(d);
		System.out.println(chaine);
		Date d2 = new Date();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd à HH:mm:ss");
		String chaine2 = formateur2.format(d2);
		System.out.println(chaine2);
	}

}
