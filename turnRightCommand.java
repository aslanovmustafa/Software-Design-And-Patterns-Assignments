public class turnRightCommand implements Command {
	turn tl;

	public turnRightCommand(turn tl) {
		this.tl = tl;
	}

	public void execute() {
		tl.right();
	}

	@Override
	public void undo() {
		tl.left();

	}

}