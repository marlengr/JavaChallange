import java.util.List;
import java.util.Random;

public class StartSentence {
	
	Random random = new Random();

	String[] table = {"Brakiem odwagi jest wiedzie� co prawe, lecz tego nie czyni�", 
						"Bezczelno�� jest najgorsz� z chor�b ludzkich",
						"Cel u�wi�ca �rodki. Tak, ale tylko w�wczas, gdy �rodki nie s� z tym celem sprzeczne",
						"To jest prawdziwa przyja�� - os�ania� innych nawet kosztem siebie",
						"Pope�ni� b��d to jeszcze nie tragedia. Tragedi� jest upieranie si� przy tym b��dzie",
						"Prawdziwe szcz�cie jest rzecz� wysi�ku, odwagi i pracy",
						"Ze �miechem nale�y obchodzi� si� ostro�nie: jest zara�liwy",
						"Odwaga - to zwyci�stwo nad w�asnym l�kiem lub cudz� �mia�o�ci�",
						"�aden wiatr nie jest dobry dla okr�tu, kt�ry nie zna portu swego przeznaczenia",
						"�ycia nie mo�na so�bie wy�biera�, ale mo�na co� z niego zrobi�"						
						};
	
	public String createSentence() {
		String sentence = table[random.nextInt(table.length)];
		System.out.println(sentence);
		return sentence;
	}
		
}
