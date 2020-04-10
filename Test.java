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

		robotControl.setCommand(0, on);
		robotControl.setCommand(1, off);
		robotControl.setCommand(2, left);
		robotControl.setCommand(3, right);
		robotControl.setCommand(4, forward);
		robotControl.setCommand(5, backward);
		robotControl.setCommand(6, plant);
		robotControl.setCommand(7, zp);
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your command: ");
			loop: while (sc.hasNext()) {
				input = sc.nextLine();
				if (input.equals("ON")) {
					robotControl.ButtonWasPushed(0);
					while (sc.hasNext() && synch.power) {
						input = sc.nextLine();
						switch (input) {
						case "ON": {
							System.out.println("Robot is already ON.");
							break;
						}
						case "FF": {
							robotControl.ButtonWasPushed(1);
							break;
						}
						case "MF": {
							robotControl.ButtonWasPushed(4);
							break;
						}
						case "MB": {
							robotControl.ButtonWasPushed(5);
							break;
						}
						case "TL": {
							robotControl.ButtonWasPushed(2);
							break;
						}
						case "TR": {
							robotControl.ButtonWasPushed(3);
							break;
						}
						case "UN": {
							robotControl.undoButtonWasPushed();
							break;
						}
						case "PF": {
							robotControl.ButtonWasPushed(6);
							break;
						}
						case "ZP": {
							robotControl.ButtonWasPushed(7);
							break;
						}
						case "GH": {
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
