package question9;
import java.util.Scanner;

public class Board {
	Scoreboard s;
	public Board(){
		s = new Scoreboard();
		loop();
	}
	
	public void loop(){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello, welcome to HiLo!");
		while(true){
			//Set difficulty
			System.out.println("\nPlease enter the difficulty for your new game.");
			System.out.println("1: Easy (50 numbers) 2: Medium (200 numbers) 3: Hard (1000 numbers)");
			int diff;
			while(true){
				diff = kb.nextInt();
				if(0 < diff & diff < 4)
					break;
				else
					System.out.println("Whoops! Please enter a valid difficulty.");
			}
			int maxNum;
			if(diff == 1)
				maxNum = 50;
			else if(diff == 2)
				maxNum = 300;
			else 
				maxNum = 1000;
			
			Game g = new Game(maxNum);
			System.out.println("The number is between 0 and " + maxNum + " inclusive. You have 10 guesses. Begin!");
			int numGuesses;
			while(true){
				System.out.println("Please enter your guess: ");
				int guess = kb.nextInt();
				numGuesses = g.guess(guess);
				
				if(numGuesses != 0){
					System.out.println("\nIt was only " + numGuesses + " guesses, too!");
					s.checkScore(numGuesses, diff);
					break;
				}else if(g.hasLost()){
					System.out.println("\nDarnit, you lost.");
					break;
				}else{
					 System.out.println(" " + (g.getMaxGuesses()-g.getNumGuesses()) + " guesses left!");
				}
			}
		}
	}
}
