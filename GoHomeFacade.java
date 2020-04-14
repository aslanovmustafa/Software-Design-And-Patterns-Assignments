/*even though go home is not really a facade (not using any commands) and just resets the coordinates and direction
 * it is still implemented as facade in case of the future possible improvements using complicated commands combinations
 * */

public class GoHomeFacade{
	int memX;
	int memY;
	String memDirection;
						
	public void goHome() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot misses home and decides to go back."); //it's quarantine, it wasn't supposed to be leaving home to begin with.
		//memorizing old values in case of undoing it
		memX=synch.X;
		memY = synch.Y;
		
		if (synch.East) {memDirection = "East"; synch.East = false;}
		else if (synch.West) {memDirection = "West";synch.West = false;}
		else if (synch.North) {memDirection = "North";}
		else if (synch.South) {memDirection = "South";synch.South = false;}
		
		//assigning new initial values
		synch.X=0;
		synch.Y=0;
		synch.North=true;
		System.out.println("Robot is back home. Position:"
				+ "\nX: " + synch.X 
				+ "\nY: " + synch.Y
				+ "\nDirection: North");
		System.out.println("-----------------------------------------------\n");
	}
	
	//the task didn't mention to add undo for go home but we decided to make one as it just reverts back the coordinations.
	public void reverseGoHome() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot decided to go back where it was at.");
		//assigning memorized values
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
