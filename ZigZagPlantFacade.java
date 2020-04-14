//facade using combination of different commands to implement zigzag planting.
public class ZigZagPlantFacade{
	//could have called directly the commands but decided to use methods instead due to better encapsulation 
	power p;
	turn t;
	move m;
	flower f;
	
	
	public ZigZagPlantFacade(power p,
							turn t,
							move m,
							flower f) {
		
		this.p = p;
		this.t = t;
		this.m = m;
		this.f = f;
	
	}
						
	//implementing: The robot moves forwards, plants a flower, turns left, moves forwards, plants a	flower, turns right
	public void ZP() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot starts planting flowes in zig zag manner.");
		m.forward();
		f.plant();
		t.left();
		m.forward();
		f.plant();
		t.right();
		System.out.println("Robot finished zig zag planting.");
		System.out.println("-----------------------------------------------\n");
	}
	
	/*	because plant flower doesn't have any undo action it cannot reap the flowers on the way back
		could have made it just printing impossible but with that the issue of wrong coordinations rise:
		in case if robot moved/turned before zigzag planting and then undoing the actions and if it can't undo the zigzag planting its coordinates will never
		be able to undo to the initial points. Which doesn't make sense. Therefore, this undo method will just undo the coordinates keeping the flowers intact
	*/
	public void reverseZP() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot is regretting its decisions and going back. But it can't reap the flowers anymore.");
		t.left();
		m.back();
		t.right();
		m.back();
		System.out.println("Robot is back to the place before it started zig zag planting."); 
		System.out.println("-----------------------------------------------\n");
	}
	
	
}
