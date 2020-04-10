import java.util.Scanner;
//class to run

public class Test {
	public static void main(String[] args) {
		String input;
		RobotControl robotControl = new RobotControl();

		power p = new power();
		move m = new move();
		turn t = new turn();
		flower f = new flower();
		ZigZagPlantFacade ZP = new ZigZagPlantFacade(p, t, m, f);

		powerOnCommand on = new powerOnCommand(p);
		powerOffCommand off = new powerOffCommand(p);

		turnLeftCommand left = new turnLeftCommand(t);
		turnRightCommand right = new turnRightCommand(t);

		moveForwardCommand forward = new moveForwardCommand(m);
		moveBackwardCommand backward = new moveBackwardCommand(m);

		plantFlowerCommand plant = new plantFlowerCommand(f);
		reapFlowerCommand reap = new reapFlowerCommand(f);

		ZPCommand zp = new ZPCommand(ZP);
		goHomeCommand goHome = new goHomeCommand(ZP);

		robotControl.setCommand(0, on, off);
		robotControl.setCommand(1, left, right);
		robotControl.setCommand(2, forward, backward);
		robotControl.setCommand(3, plant, reap);
		robotControl.setCommand(4, zp, goHome);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your command: ");
			loop: while (sc.hasNext()) {
				input = sc.nextLine();
				if (input.equals("ON")) {
					robotControl.FirstButtonWasPushed(0);
					while (sc.hasNext() && synch.power) {
						input = sc.nextLine();
						switch (input) {
						case "ON": {
							System.out.println("Robot is already ON.");
							break;
						}
						case "FF": {
							robotControl.SecondButtonWasPushed(0);
							break;
						}
						case "MF": {
							robotControl.FirstButtonWasPushed(2);
							break;
						}
						case "MB": {
							robotControl.SecondButtonWasPushed(2);
							break;
						}
						case "TL": {
							robotControl.FirstButtonWasPushed(1);
							break;
						}
						case "TR": {
							robotControl.SecondButtonWasPushed(1);
							break;
						}
						case "UN": {
							robotControl.undoButtonWasPushed();
							break;
						}
						case "PF": {
							robotControl.FirstButtonWasPushed(3);
							break;
						}
						case "ZP": {
							robotControl.FirstButtonWasPushed(4);
							break;
						}
						case "GH": {
							robotControl.SecondButtonWasPushed(4);
							break;
						}
						case "QUIT":
							break loop;
						default: {
							System.out.println("Try again: ");
						}
						}
					}

				} else {
					System.out.println("Robot is OFF. Turn it ON if you want it to move!");
				}
			}
			sc.close();
		}
	}
}
