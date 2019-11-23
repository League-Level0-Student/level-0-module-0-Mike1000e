package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) throws Exception {
		Robot lolMaster = new Robot();
		lolMaster.setSpeed(10);
		lolMaster.penDown();
		lolMaster.move(200);
		lolMaster.turn(135);
		lolMaster.move(100);
		lolMaster.turn(-90);
		lolMaster.move(100);
		lolMaster.turn(135);
		lolMaster.move(200);
		lolMaster.hide();

	}
}
