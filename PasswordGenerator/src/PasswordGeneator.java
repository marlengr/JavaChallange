import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordGeneator {

	private String password;
	private StringBuilder sb;
	private int number;
	private List<Integer> list;

	public PasswordGeneator() {
		this.list = new ArrayList<>();
		this.sb = new StringBuilder();	
		
		createPassword();
		}
		
	public int createNumber() {
		System.out.println("Wybierz liczbe znakow");
		Scanner scanner = new Scanner(System.in);
		String number2 = scanner.nextLine();
		number = Integer.parseInt(number2);
		return number;
		
	}
	public String createPassword() {
		createNumber();
		for(int i = 33; i<127; i++) {
			list.add(i);
		}
		
		for(int i = 0; i<number; i++) {
			number = list.get(new SecureRandom().nextInt(94));
			sb.append((char) number);
		}
		// append ³¹czy ze soba znaki 
		
		password = sb.toString();
		System.out.println(password);
		return password;
	}

	
}
