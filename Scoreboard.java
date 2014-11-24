package question9;

import java.util.Scanner;

public class Scoreboard {
	private Score[][] highscores = new Score[3][10];
	
	public Scoreboard(){
		for(int i = 0; i < highscores.length; i++){
			for(int j = 0; j < highscores[i].length; j++){
				highscores[i][j] = new Score("-", 11);
			}
		}
	}
	
	public void printTable(){
		System.out.println("Easy\t\t\tMedium\t\t\tHard");
		System.out.println("Name\t\tScore\tName\t\tScore\tName\t\tScore");
		for(int i = 0; i < highscores[0].length; i++){
			int score1, score2, score3;
			String name1, name2, name3;
			
			score1 = highscores[0][i].getScore();
			score2 = highscores[1][i].getScore();
			score3 = highscores[2][i].getScore();
			name1 = highscores[0][i].getName();
			name2 = highscores[1][i].getName();
			name3 = highscores[2][i].getName();			
			
			if(score1 == 11)
				score1 = 0;
			if(score2 == 11)
				score2 = 0;
			if(score3 == 11)
				score3 = 0;
			if(name1.length() < 8)
				name1 += "\t";
			if(name2.length() < 8)
				name2 += "\t";
			if(name3.length() < 8)
				name3 += "\t";
			
			System.out.print(name1 + "\t" + score1);
			System.out.print("\t" + name2 + "\t" + score2);
			System.out.print("\t" + name3 + "\t" + score3);
			
			System.out.println();
		}
	}
	
	public void checkScore(int numGuesses, int diff){
		if(highscores[diff-1][9].getScore() > numGuesses){
			Scanner kb = new Scanner(System.in);
			
			System.out.println("You got a highscore! Please enter your name:");
			String newName = kb.next();
			Score score = new Score(newName, numGuesses);
			
			for(int i = 8; i >= 0; i--){
				if(highscores[diff-1][i].getScore() <= numGuesses){
					insertScore(score, i+1, diff);
					break;
				}else if(i == 0){
					insertScore(score, 0, diff);
				}
			}
			
			printTable();
		}
	}
	
	private void insertScore(Score s, int i, int diff){
		for(int j = 9; j > i; j--){
			highscores[diff-1][j] = highscores[diff-1][j-1];
		}
		highscores[diff-1][i] = s;
	}
}
