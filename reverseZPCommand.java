
public class reverseZPCommand implements Command{

	  ZigZagPlantFacade zp;
	  
	  public reverseZPCommand(ZigZagPlantFacade zp) {
	    this.zp = zp;
	  }
	
	
	@Override
	public void execute() {
		zp.reverseZP();
		
	}

	@Override
	public void undo() {
		zp.ZP();
	}

}
