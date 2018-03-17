package calculateAgeInSeconds_03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calculateAgeInSeconds {

	public static void main(String[] args) throws ParseException {
		
		Date date1, dateFormat3;
		Calendar calendar = Calendar.getInstance();
		System.out.println("Podaj datê urodzenia w formacie DD-MM-RRRR HH:MM:SS");
		
		Scanner scanner = new Scanner(System.in);
		//==============================
		// pobranie daty wpisanej z klawiatury
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		String date = scanner.nextLine();		
		date1 = dateFormat.parse(date);
		System.out.println(date1);
		
		//===============================
		//pobranie aktualnej daty
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String dateFormat2 = dateFormat1.format(calendar.getTime());
		//String dateFormat2 = dateFormat1.format(dateFormat1);
		dateFormat3 = dateFormat1.parse(dateFormat2);
		System.out.println(dateFormat3);
		
		//==============================
		// porownanie dat
		//duratin nie zadziala dla zmienny Date
		//Duration duration = Duration.between(date1, dateFormat3);
		
		long duration = (dateFormat3.getTime() - date1.getTime())/ 1000;
		System.out.println("Prze¿y³eœ ju¿ " + duration + " sekund");
		
		
	}

}
