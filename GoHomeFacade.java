public class GoHomeFacade{
	int memX;
	int memY;
						
	public void goHome() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot misses home and decides to go back."); //it's quarantine, it wasn't supposed to be leaving home to begin with.
		memX=synch.X;
		memY = synch.Y;
		
		synch.X=0;
		synch.Y=0;
		System.out.println("Robot is back home. Position:"
				+ "\nX: " + synch.X 
				+ "\nY: " + synch.Y);
		System.out.println("-----------------------------------------------\n");
	}
	
	public void reverseGoHome() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot decided to go back where it was at.");
		synch.X=memX;
		synch.Y=memY;
		System.out.println("Robot is back to the place. Position:"
				+ "\nX: " + synch.X 
				+ "\nY: " + synch.Y);
		System.out.println("-----------------------------------------------\n");
	}
	
	
}
