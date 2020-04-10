public class GoHomeFacade{
	int memX;
	int memY;
	String memDirection;
						
	public void goHome() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot misses home and decides to go back."); //it's quarantine, it wasn't supposed to be leaving home to begin with.
		memX=synch.X;
		memY = synch.Y;
		
		if (synch.East) {memDirection = "East"; synch.East = false;}
		else if (synch.West) {memDirection = "West";synch.West = false;}
		else if (synch.North) {memDirection = "North";}
		else if (synch.South) {memDirection = "South";synch.South = false;}
		
		synch.X=0;
		synch.Y=0;
		synch.North=true;
		System.out.println("Robot is back home. Position:"
				+ "\nX: " + synch.X 
				+ "\nY: " + synch.Y
				+ "\nDirection: North");
		System.out.println("-----------------------------------------------\n");
	}
	
	public void reverseGoHome() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot decided to go back where it was at.");
		synch.X=memX;
		synch.Y=memY;
		if (memDirection.contentEquals("East")) {synch.East = true; synch.North=false;}
		else if (memDirection.contentEquals("West")) {synch.West = true; synch.North=false;}
		else if (memDirection.contentEquals("South")) {synch.South = true; synch.North=false;}
			
			
			System.out.println("Robot is back to the place. Position:"
				+ "\nX: " + synch.X 
				+ "\nY: " + synch.Y
				+ "\nDirection: " + memDirection);
		System.out.println("-----------------------------------------------\n");
	}
	
	
}
