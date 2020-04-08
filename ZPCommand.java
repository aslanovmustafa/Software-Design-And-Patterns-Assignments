
public class ZPCommand implements Command{

	  ZigZagPlantFacade zp;
	  
	  public ZPCommand(ZigZagPlantFacade zp) {
	    this.zp = zp;
	  }
	
	
	@Override
	public void execute() {
		zp.ZP();
		
	}

	@Override
	public void undo() {
		zp.goHome();
	}

}
