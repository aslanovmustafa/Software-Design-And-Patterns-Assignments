public class turn {

  public void left() {
	  if (synch.North) {synch.West = true; synch.North = false; 	System.out.println("Robot turned left. Now facing West direction.");}
	  else if (synch.West) {synch.South = true; synch.West = false;    System.out.println("Robot turned left. Now facing South direction.");}
	  else if (synch.South) {synch.East = true; synch.South = false;    System.out.println("Robot turned left. Now facing East direction.");}
	  else if (synch.East) {synch.North = true; synch.East = false;    System.out.println("Robot turned left. Now facing North direction.");}
  }
  
  public void right() {
	  if (synch.South) {synch.West = true; synch.South = false; 	System.out.println("Robot turned right. Now facing West direction.");}
	  else if (synch.East) {synch.South = true; synch.East = false;    System.out.println("Robot turned right. Now facing South direction.");}
	  else if (synch.North) {synch.East = true; synch.North = false;    System.out.println("Robot turned right. Now facing East direction.");}
	  else if (synch.West) {synch.North = true; synch.West = false;    System.out.println("Robot turned right. Now facing North direction.");}
  }
}