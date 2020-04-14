// command to execute go home facade's go home method
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


