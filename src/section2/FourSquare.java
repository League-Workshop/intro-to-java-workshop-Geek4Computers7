package section2;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot izzie=new Robot();

	void go() {
		izzie.setSpeed(500);
		izzie.penDown();
		izzie.setPenWidth(10);	
	}

	void drawSquare() {
		izzie.move(100);
		izzie.turn(90);
		izzie.move(100);
		izzie.turn(90);
		izzie.move(100);
		izzie.turn(90);
		izzie.move(100);
		izzie.turn(90);

		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



