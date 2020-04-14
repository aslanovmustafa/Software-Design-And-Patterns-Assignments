//command to plant flower
public class plantFlowerCommand implements Command{
	flower f;
	public plantFlowerCommand(flower f) {
		this.f = f;
	}
	
	@Override
	public void execute() {
		f.plant();
		
	}

	@Override
	public void undo() {
		System.out.println("Impossible"); //can't undo this action
	}

}
