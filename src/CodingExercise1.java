import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

   	 // 2. set the pen width to 10

   	 // 1. make the Robot draw a shape
   	 Robot droid = new Robot();
   	 droid.setPenWidth(10);
   	 String c = JOptionPane.showInputDialog("What color would you like the robot to draw?");
   	 if (c.equals("green")) {
   		 droid.setPenColor(Color.GREEN);
		
	}
   	 if (c.equals("Green")) {
   		 droid.setPenColor(Color.GREEN);
		
	}
   	 if (c.equals("red")) {
		droid.setPenColor(Color.RED);
	}
   	 if (c.equals("Red")) {
		droid.setPenColor(Color.RED);
	}
   	 if (c.equals("blue")) {
		droid.setPenColor(Color.BLUE);
	}
   	 if (c.equals("Blue")) {
		droid.setPenColor(Color.BLUE);
	}
   	 droid.penDown();
   	 droid.setSpeed(200);
   	 for (int i = 0; i < 13; i++) {
		droid.turn(10);
		droid.move(50);
		droid.turn(-150);
		droid.move(20);
		droid.turn(30);
	}
   	 droid.hide();
   	 
    }

}
