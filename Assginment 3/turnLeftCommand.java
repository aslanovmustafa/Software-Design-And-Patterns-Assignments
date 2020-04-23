//command to turn robot left
public class turnLeftCommand implements Command {
	turn tl;

	public turnLeftCommand(turn tl) {
		this.tl = tl;
	}

	public void execute() {
		tl.left();
	}

	@Override
	public void undo() {
		tl.right();

	}

}