import java.util.Scanner;

public class ReverseAString {

	
	public void reverse() {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Wpisz ci�g znak�w ");
		Scanner scanner = new Scanner(System.in);
		String startString = scanner.nextLine();
		sb.append(startString);
		StringBuilder stopString = sb.reverse();
		
		System.out.println(stopString);
				
	}
}
