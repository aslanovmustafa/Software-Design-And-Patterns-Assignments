//if the weather is rainy software configures parameters itself
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
		System.out.println("Robot starts planting flowes in zig zag manner.");
		m.forward();
		f.plant();
		t.left();
		m.forward();
		f.plant();
		t.right();
		System.out.println("Robot finished zig zag planting.");
	}
	
	public void goHome() {//assuming i can only call ZP once?
		System.out.println("Robot is going home now.");
		t.left();
		m.back();
		t.right();
		m.back();
		System.out.println("Robot is back home."); //it's quarantine it wasn't supposed to be leaving home to begin with.
	}
	
	
}
