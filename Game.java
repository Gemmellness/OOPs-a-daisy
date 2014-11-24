package question9;

import java.util.Random;

public class Game {
	private int number;
	private int numGuesses = 0;
	private final int maxGuesses = 10;
	
	public Game(int maxNum){
		Random r = new Random();
		number = r.nextInt(maxNum+1);
	}
	
	public int guess(int i){
		numGuesses++;
		
		if(i < number)
			System.out.print("Go higher!");
		else if(i > number)
			System.out.print("Go lower!");
		else{
			System.out.print("Correct!");
			return numGuesses;
		}
		
		return 0;
	}
	
	public boolean hasLost(){
		if(numGuesses < maxGuesses)
			return false;
		return true;
	}
	
	public int getMaxGuesses(){
		return maxGuesses;
	}
	
	public int getNumGuesses(){
		return numGuesses;
	}
	
}
