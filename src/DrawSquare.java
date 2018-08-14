import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
	Robot Ava = new Robot();
	Ava.miniaturize();
	Ava.penDown();
	Ava.setSpeed(73);
	Ava.setPenWidth(84);
	for(int i=0;i<4;i++) {
	Ava.setRandomPenColor();
	Ava.move(200);
	Ava.turn(90);
	}
	Ava.hide();
	Ava.penUp();
	Ava.setSpeed(26);
	for(int i=0;i<4;i++) {
		Ava.setPenColor(null);
		Ava.sparkle();
		Ava.move(200);
		Ava.turn(90);
	}
}
}
