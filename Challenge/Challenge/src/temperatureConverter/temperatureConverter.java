package temperatureConverter;

import java.util.Scanner;

public class temperatureConverter {

	static void convertTemperature() {

		String temperature, unit;
		double doubleTemperature = 0, doubleTemperatureC = 0, doubleTemperatureK = 0, doubleTemperatureF = 0;
		boolean isDigit;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Wpisz temperature:");
		temperature = scanner.nextLine();
		char temperature2 = temperature.charAt(0);
		isDigit = Character.isDigit(temperature2);
		if (isDigit == true) {
			doubleTemperature = Double.parseDouble(temperature);

		} else {
			System.out.println("Nie wybrano liczby");
		}

		System.out.println("Wybierz jednostke temperatury, któr¹ chcesz przekonwertowaæ:");
		unit = scanner.nextLine();

		switch (unit) {

		case "c":
			doubleTemperatureK = doubleTemperature + 273.15;
			System.out.println(doubleTemperatureK + " w kelwinach");

			doubleTemperatureF = (doubleTemperature * (9 / 5)) + 32;
			System.out.println(doubleTemperatureF + " w fahrenheit");
			break;

		case "k":
			doubleTemperatureC = doubleTemperature - 273.15;
			System.out.println(doubleTemperatureC + " w celcjuszach");

			doubleTemperatureF = ((doubleTemperature - 273.15) * 1.8) + 32;
			System.out.println(doubleTemperatureF + "w fahrenheit");
			break;

		case "f":
			doubleTemperatureC = (doubleTemperature - 32) / 1.8;
			System.out.println(doubleTemperatureC + " w celcjuszach");

			doubleTemperatureK = ((doubleTemperature - 32) / 1.8) + 273.15;
			System.out.println(doubleTemperatureK + " w kelwinach");
			break;

		default:
			System.out.println("Wpisano niezidentyfikowany znak");
			break;

		}

		scanner.close();

	}

}