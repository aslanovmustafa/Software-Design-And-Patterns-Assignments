public class move {
	

	  public void forward() {
		  
		  if (synch.North) synch.Y++;
		  else if (synch.East) synch.X++;
		  else if (synch.South) synch.Y--;
		  else if (synch.West) synch.X--;
	  
		    System.out.println("Robot moved forward. New position:\n"
		    		+ "X:" + synch.X
		    		+ "\nY:" + synch.Y);
		  }
	  
	  public void back() {
		  
		  if (synch.North) synch.Y--;
		  else if (synch.East) synch.X--;
		  else if (synch.South) synch.Y++;
		  else if (synch.West) synch.X++;
		  
			System.out.println("Robot moved backward. New position:\n"  
					+ "X:" + synch.X
		    		+ "\nY:" + synch.Y);
			}
}
