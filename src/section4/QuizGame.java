package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
	// 1.  Create a variable to hold the user's score 
	// 2.  Ask the user a question 
		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		// -- add one to their score 
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 		
		// 6.  After all the questions have been asked, print the user's score 
		
		int score=0;
	String answeri=JOptionPane.showInputDialog("What is the name of the first Sherlock Holmes book?");
if(answeri.equalsIgnoreCase("A Study in Scarlet")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct.");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong.");
}

String answerii=JOptionPane.showInputDialog("What is the first and last name of Sherlock's partner in solving crime?");
if(answerii.equalsIgnoreCase("John Watson")) {
score++;
JOptionPane.showMessageDialog(null, "Correct.");
}
else {
JOptionPane.showMessageDialog(null, "Wrong.");
}

String answeriii=JOptionPane.showInputDialog("What is Sherlock's occupation name? Be specific.");
if(answeriii.equalsIgnoreCase("Consulting detective")) {
score++;
JOptionPane.showMessageDialog(null, "Correct.");
}
else {
JOptionPane.showMessageDialog(null, "Wrong.");
}

String answeriv=JOptionPane.showInputDialog("What was John's occupation before he met Sherlock?");
if(answeriv.equalsIgnoreCase("Army Doctor")) {
score++;
JOptionPane.showMessageDialog(null, "Correct.");
}
else {
JOptionPane.showMessageDialog(null, "Wrong.");
}

String answerv=JOptionPane.showInputDialog("What is Sherlock and John's address?");
if(answerv.equalsIgnoreCase("221b Baker Street")) {
score++;
JOptionPane.showMessageDialog(null, "Correct.");
}
else {
JOptionPane.showMessageDialog(null, "Wrong.");
	}
JOptionPane.showMessageDialog(null, "You got "+score+" questions out of 5 correct!");}
	
}
