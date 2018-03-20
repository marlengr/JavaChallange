package FizzBuzz_05;

//import java.util.Random;

public class FizzBuzz {

	public static void main(String[] args) {
		
//		gdyby mia³a byæ jedna losowa liczba 		
//		Random random = new Random();
//		int number = random.nextInt(101);
		
		for (int number=1; number<=100; number++) {
		
		if(number % 15 == 0) {
			System.out.println("FizzBuzz");
			continue;
		}
		if(number % 3 == 0) {
			System.out.println("Fizz");
			continue;
		}
		if(number % 5 == 0) {
			System.out.println("Buzz");
			continue;
		}
		else {
			System.out.println(number);
		}
		
		}
// 		krótszy i ³adniejszy sposób		
//		for(int i = 0; i < 100; i++, System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "")  : i));
	}
}

