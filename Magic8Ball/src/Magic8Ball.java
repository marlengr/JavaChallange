import java.util.Random;
import java.util.Scanner;

import com.sun.jmx.snmp.Timestamp;

public class Magic8Ball {
	
	public static void main(String[] args) {
		
		String[] tab = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it",
				"As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again",
				"Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
				"Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
		
		Random random = new Random();
		String answer = tab[random.nextInt(tab.length)];

		System.out.println("Zadaj pytanie: ");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println(answer);
								
	}
}
