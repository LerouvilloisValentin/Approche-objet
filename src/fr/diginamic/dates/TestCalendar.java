package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd à HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		Date d = new Date();
		calendar.set(2016, 04,19,23,59,30);
		d = calendar.getTime();
		String chaine = formateur.format(d);
		System.out.println(chaine);
		Date d2 = new Date();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd à HH:mm:ss");
		String chaine2 = formateur2.format(d2);
		System.out.println(chaine2);
		Locale localeRu = new Locale("ru", "RU");
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MMMM/dd à HH:mm:ss", localeRu);
		String chaine3 = formateur3.format(d2);
		System.out.println(chaine3);
	}

}
