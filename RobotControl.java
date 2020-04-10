import java.util.ArrayList;

//all commands stored here

public class RobotControl {
	Command[] Commands1;
	Command undoCommand;
	ArrayList<Command> cmdList = new ArrayList<Command>();
	int unSlot;

	public RobotControl() {
		Commands1 = new Command[10];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 10; i++) {
			Commands1[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command command1) {
		Commands1[slot] = command1;

	}

	public void ButtonWasPushed(int slot) {
		Commands1[slot].execute();
		cmdList.add(Commands1[slot]);
		unSlot++;
	}


	public void undoButtonWasPushed() {

		unSlot--;
		if (unSlot <= 0) {
			System.out.println("Impossible");
			unSlot++;
		} else {
			undoCommand = cmdList.get(unSlot);
			undoCommand.undo();
			undoCommand = cmdList.remove(unSlot);
		}
	}
}