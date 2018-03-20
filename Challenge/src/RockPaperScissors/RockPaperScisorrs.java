package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScisorrs {
	private User user;
	private Computer computer;	
	private enum Move {
		ROCK, PAPER, SCISSORS;
		
		public int compare(Move otherMove) {
			if(this == otherMove) {
					return 0;
					}
			else {
			switch(this) {
			case ROCK: 
				return (otherMove == SCISSORS ? 1 : 2);
			case PAPER: 
				return (otherMove == ROCK ? 1 : 2);
			case SCISSORS: 
				return (otherMove == PAPER ? 1 : 2);
			}	
			
			}return 0;	
				
		}		
	}	
	
	public RockPaperScisorrs() {
		user = new User();
		computer = new Computer();
	}
	private class User{
		private Scanner scanner;
		public User() {
			scanner = new Scanner(System.in);
		}
		public Move getMove() {
			String userChoice = scanner.nextLine();
			userChoice = userChoice.toUpperCase();
			char letter = userChoice.charAt(0);
			if(letter == 'R' || letter == 'P' || letter == 'S') {
				switch(letter) {
				case 'R' :
					return Move.ROCK;
				case 'S' : 
					return Move.SCISSORS;
				case 'P' : 
					return Move.PAPER;
				}
			}
			
			return getMove();
		}
	}
	
	private class Computer{
		public Move getMove() {
					
		Move[] moves = Move.values();
		Random random = new Random();		
		int index = random.nextInt(moves.length);
		return moves[index];
	}
	}
	
	public void startGame() {
		System.out.println("Choose ROCK, PAPER, SCISSORS");
		Move userChoice = user.getMove();
		Move computerMove = computer.getMove();
		//System.out.println(userChoice);
		//System.out.println(computerMove);
		
		int compareMoves = userChoice.compare(computerMove);
		switch(compareMoves) {
		case 0 : 
			System.out.println("Remis");
			break;
		case 1: 
			System.out.println(userChoice + " pobi³ " + computerMove + "\nWygrana!");
			break;
		case 2:
			System.out.println(computerMove + "pobi³" + userChoice + "\nPrzegrana!");
			break;
		}
	}
	
	public static void main(String[] args) {
	    RockPaperScisorrs game = new RockPaperScisorrs();
	    game.startGame();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	int computerChoice;
//	int userChoiceInt;
//	boolean rock, paper, scissors;

//	public static void main(String[] args) {		
				
//		losowanie z tablicy stringów 
//		String[] tab = {"rock", "paper", "scissors"};
//				
//		int range = tab.length -1; // maksymalny zakres tablicy 		
//		int choice =(int)Math.round(Math.random()*range);
//		String computerChoice = tab[choice];
//		System.out.println(computerChoice);
//		
//		System.out.println("Wybierz moc: 1 - scissors, 2 - rock, 3 - paper");
//		String userChoice = scanner.nextLine();	
						
//	}
	
//	public int compare(int computerChoice, int userChoice) {
//		this.computerChoice = computerChoice;
//		this.userChoiceInt = userChoice;
//		
//	}
		
//	public void choiceThePower() {
//		
//		Scanner scanner = new Scanner(System.in);
//		Random random = new Random();
//		computerChoice = random.nextInt(3)+1;
//		System.out.println(computerChoice);
//		System.out.println("Wybierz swoj¹ moc: 1 - kamieñ, 2 - papier, 3 - nozyce");
//		String userChoice = scanner.nextLine();
//		System.out.println(userChoice);
//		userChoiceInt = Integer.parseInt(userChoice);
//	}
//	public void compare() {
//		if(computerChoice == userChoiceInt) {
//			System.out.println("Komputer równie¿ wybra³: " + computerChoice + "\nRemis");
//		}
//				
//		
//		// 1 kamien, 2 papier, 3 nozyce
//				
//	}

