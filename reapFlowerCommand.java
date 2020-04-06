
public class reapFlowerCommand implements Command{
	flower f;
	public reapFlowerCommand(flower f) {
		this.f = f;
	}
	
	@Override
	public void execute() {
		f.reap();
		
	}

	@Override
	public void undo() {
		f.plant();
		
	}
}
