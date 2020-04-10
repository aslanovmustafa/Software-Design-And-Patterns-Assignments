
public class GoHomeCommand implements Command {

	  GoHomeFacade gh;
	  
	  public GoHomeCommand(GoHomeFacade gh) {
	    this.gh = gh;
	  }
	
	
	@Override
	public void execute() {
		gh.goHome();
		
	}

	@Override
	public void undo() {
		gh.reverseGoHome();
	}

}


