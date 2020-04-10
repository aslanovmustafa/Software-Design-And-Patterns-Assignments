public class ZigZagPlantFacade{
	
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
	
	public void reverseZP() {
		System.out.println("-----------------------------------------------");
		System.out.println("Robot is regretting its decisions and going back.");
		t.left();
		f.reap();
		m.back();
		t.right();
		f.reap();
		m.back();
		System.out.println("Robot is back to the place before it started zig zag planting."); //it's quarantine it wasn't supposed to be leaving home to begin with.
		System.out.println("-----------------------------------------------\n");
	}
	
	
}
