import java.util.ArrayList;

//all commands stored here

public class RobotControl {
	Command[] Commands1;
	Command[] Commands2;
	Command undoCommand;
	ArrayList<Command> cmdList = new ArrayList<Command>();
	int unSlot;

	public RobotControl() {
		Commands1 = new Command[5];
		Commands2 = new Command[5];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 5; i++) {
			Commands1[i] = noCommand;
			Commands2[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command command1, Command command2) {
		Commands1[slot] = command1;
		Commands2[slot] = command2;

	}

	public void FirstButtonWasPushed(int slot) {
		Commands1[slot].execute();
		cmdList.add(Commands1[slot]);
		unSlot++;
	}

	public void SecondButtonWasPushed(int slot) {
		Commands2[slot].execute();
		cmdList.add(Commands2[slot]);
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