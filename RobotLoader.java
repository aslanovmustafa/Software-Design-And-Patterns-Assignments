//loader class to run

public class RobotLoader {
  
  public static void main(String[] args) {
//	  if (synch.power) {
//		}
//	  else {throw new java.lang.Error("Robot is OFF. Turn it ON if you want it to move!");}
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

 
    robotControl.onButtonWasPushed(0);
    robotControl.offButtonWasPushed(0);
    robotControl.undoButtonWasPushed();
    
    robotControl.onButtonWasPushed(1);
    robotControl.offButtonWasPushed(1);
    robotControl.undoButtonWasPushed();
    
    robotControl.onButtonWasPushed(2);
    robotControl.offButtonWasPushed(2);
    robotControl.undoButtonWasPushed();
    
    robotControl.onButtonWasPushed(3);
    robotControl.offButtonWasPushed(3);
    robotControl.undoButtonWasPushed();
    
    robotControl.onButtonWasPushed(4);
    robotControl.offButtonWasPushed(4);
    robotControl.undoButtonWasPushed();

  }
}
