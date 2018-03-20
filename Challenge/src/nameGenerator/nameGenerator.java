package nameGenerator;

import java.util.Random;

public class nameGenerator {

	public static void main(String[] args) {
		
		Random generator = new Random();
		//number = generator.nextInt(15)+4; losowanie  							
		
		String[] tab = {"on", "son", "mat", "task", "oski", "ura", "tina", "ika", "ika"};
		String[] tab2 = {"Seb", "Kat", "An", "Ron", "Mon", "Mak", "Stat", "Ali", "An", "Ce", "Ur"};		
		
		String coss = tab[generator.nextInt(tab.length)];
		String cosss = tab2[generator.nextInt(tab2.length)];
		
		System.out.println(cosss+coss);			

	}

}
