public class power {
//power of the robot is controlled using this class's methods
  public void on() {
	  synch.power = true;
    System.out.println("The robot is ON.");
  }
  
  public void off() { 
	  synch.power = false;
    System.out.println("The robot is OFF.");
  }
  
}