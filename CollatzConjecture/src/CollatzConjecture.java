import java.util.Scanner;

public class CollatzConjecture {

	private int number;
	
	public void count() {
		System.out.println("Podaj liczbê od której chcesz zacz¹æ ci¹g");
		Scanner scanner = new Scanner(System.in);
		String number2 = scanner.nextLine();
		number = Integer.parseInt(number2);
		do {
			
		if(number%2 == 0) {
			number = number/2;
			System.out.println("kolejne kroki: " + number);
		}
		else {
			number = ((3*number) + 1);
			System.out.println("kolejne kroki: " + number);
		}
		
		} while (number > 1);
		scanner.close();
	}
}
