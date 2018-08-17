package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it	

	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon Smaug to take its treasure!", "Dragon Fighter", 0, dragon);
	// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		// 4. Create a variable to hold the damage the player's attack does each round
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int playerHealth=100;
		int dragonHealth=100;

		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).	
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		// 9. If they typed in "yell":
		
		
		
		
		
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		
		String attack=JOptionPane.showInputDialog("Do you want to attack Smaug with a yell or a kick?");

		if(attack.equalsIgnoreCase("yell")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			int dragonDamage=new Random().nextInt(11);
			//-- Subtract that number from the dragon's health variable 
			dragonHealth=dragonHealth-dragonDamage;
			JOptionPane.showMessageDialog(null, "Smaug lost "+dragonDamage+" health points!");
		}
		// 10. If they typed in "kick":
		if(attack.equalsIgnoreCase("kick")){
			int dragonDamage=new Random().nextInt(26);
			dragonHealth=dragonHealth-dragonDamage;
			JOptionPane.showMessageDialog(null, "Smaug lost "+dragonDamage+" health points!");
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		// 12. Subtract this number from the player's health
		// 13. If the user's health is less than or equal to 0	
			//-- Tell the user that they lost	
		// 14. Else if the dragon's health is less than or equal to 0	
			//-- Tell the user that the dragon is dead and they took a ton of gold!	
	   //  15.  Else
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		int playerDamage=new Random().nextInt(36);
		playerHealth=playerHealth-playerDamage;
		if(dragonHealth<=0) {
			JOptionPane.showMessageDialog(null, "The dragon Smaug is dead, you and your dwarves have recieved a ton of gold!");
		}
			else {
			if(playerHealth<=0) {
				JOptionPane.showMessageDialog(null, "You were unable to defeat Smaug.\nHe went on to kill the dwarves and terrorize Lake-Town.\nLuckily, Bard of Dale was able to kill Smaug with his black arrow, saving the world from the dragon.\nNevertheless, you, Bilbo, are known as the villian who awoke Smaug and put him on the path of destorying Lake-Town.\nThe other hobbits have an even greater hatred for you since you brought disgrace upon the hobbit race.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You've just lost "+playerDamage+" health points!\nYou now have "+playerHealth+" health points out of 100 and Smaug has "+dragonHealth+" health points out of 100.");
			}
		}
	}
	}
}

