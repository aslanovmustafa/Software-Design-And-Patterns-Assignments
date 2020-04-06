public class moveBackwardCommand implements Command {
  move mb;

	public moveBackwardCommand( move mb) {
		this.mb = mb;
	}

	public void execute() {
		mb.back();
	}

	@Override
	public void undo() {
		//
		
	}
}