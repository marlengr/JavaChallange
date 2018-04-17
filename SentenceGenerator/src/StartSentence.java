import java.util.List;
import java.util.Random;

public class StartSentence {
	
	Random random = new Random();

	String[] table = {"Brakiem odwagi jest wiedzieæ co prawe, lecz tego nie czyniæ", 
						"Bezczelnoœæ jest najgorsz¹ z chorób ludzkich",
						"Cel uœwiêca œrodki. Tak, ale tylko wówczas, gdy œrodki nie s¹ z tym celem sprzeczne",
						"To jest prawdziwa przyjaŸñ - os³aniaæ innych nawet kosztem siebie",
						"Pope³niæ b³¹d to jeszcze nie tragedia. Tragedi¹ jest upieranie siê przy tym b³êdzie",
						"Prawdziwe szczêœcie jest rzecz¹ wysi³ku, odwagi i pracy",
						"Ze œmiechem nale¿y obchodziæ siê ostro¿nie: jest zaraŸliwy",
						"Odwaga - to zwyciêstwo nad w³asnym lêkiem lub cudz¹ œmia³oœci¹",
						"¯aden wiatr nie jest dobry dla okrêtu, który nie zna portu swego przeznaczenia",
						"¯ycia nie mo¿na so­bie wy­bieraæ, ale mo¿na coœ z niego zrobiæ"						
						};
	
	public String createSentence() {
		String sentence = table[random.nextInt(table.length)];
		System.out.println(sentence);
		return sentence;
	}
		
}
