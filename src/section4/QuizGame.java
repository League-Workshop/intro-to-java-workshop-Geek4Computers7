package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		
		// 2.  Ask the user a question
		String answer = JOptionPane.showInputDialog("Spoiler alert, what book did dumbledore die");
		
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("the half blood prince")) {
		
		// 4.  if the user's answer is correct
			JOptionPane.showMessageDialog(null, "Yes");
			score = score + 1;
		}
		// -- add one to their score 
		else {
			JOptionPane.showMessageDialog(null, "no");
		}
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String movie = JOptionPane.showInputDialog("Which movie was better, transformers 1 or 2?");
		if(movie.equalsIgnoreCase("neither")){
			JOptionPane.showMessageDialog(null, "Yes!");
			score = score +1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry but the answer was netheir...they both were horrible");
		}
		String ilmnti = JOptionPane.showInputDialog("is the illuminati controlling everything we say and do online, no or no.");
		if(ilmnti.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null,"correct the illuminati is not watching watching any of us and changing my code,help");
			JOptionPane.showMessageDialog(null,"Heres a free five points");
			score = score +5;
		}
		else {JOptionPane.showMessageDialog(null, "you have angered us -5");
		score = score -5;
		}
		String should = JOptionPane
		// 6.  After all the questions have been asked, print the user's score
		 JOptionPane.showMessageDialog(null, "Oh no the illiminati has hacked my computer! I can't see my screen, you have to sht..dwn..your..self.I'm breaking up quick follow my instructions. you have to type a code to shut this down the code is complicated so listen carefully. ");
		 JOptionPane.showMessageDialog(null, "The code is 1 2 3 4 but not in that order. The first and second number equal the third number, and the second number is half the fourth number");  
		 String one = JOptionPane.showInputDialog("Code?");
		 if (one.equalsIgnoreCase("1234")) {
		 JOptionPane.showMessageDialog(null, "Game over, but you saved us all");
		 }
		 else {JOptionPane.showMessageDialog(null, "What have you done, you doomed us all! thank you for lettin the illuminati rule the world. your score is " + score);
	}
}
}