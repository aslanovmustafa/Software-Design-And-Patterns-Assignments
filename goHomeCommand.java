
public class goHomeCommand implements Command{

	  ZigZagPlantFacade zp;
	  
	  public goHomeCommand(ZigZagPlantFacade zp) {
	    this.zp = zp;
	  }
	
	
	@Override
	public void execute() {
		zp.goHome();
		
	}

	@Override
	public void undo() {
		zp.ZP();
	}

}
