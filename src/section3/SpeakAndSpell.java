package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		// 2. Catch the user's answer in a String
		// 3. If the user spelled the word correctly, speak "correct"
		// 4. Otherwise say "wrong"
		// 5. repeat the process for other words
int score=0;
		speak("Spell Sherlock");
String answer=JOptionPane.showInputDialog(null);
if(answer.equalsIgnoreCase("Sherlock")){
	speak("Correct.");
score++;
}
else {
	//speak("Wrong.");
}

speak("Spell Violoncello");
String answeri=JOptionPane.showInputDialog(null);
if(answeri.equalsIgnoreCase("violoncello")){
	speak("Correct.");
	score++;
	}
	
else {
	speak("Wrong.");
}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


