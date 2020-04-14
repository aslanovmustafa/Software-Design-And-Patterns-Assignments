import java.util.ArrayList;

//all commands stored here

public class RobotControl {
	Command[] Commands;
	Command undoCommand;
	ArrayList<Command> cmdList = new ArrayList<Command>(); //array list where commands will be stored
	int unSlot; //indexing

	public RobotControl() {
		Commands = new Command[10];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 10; i++) {
			Commands[i] = noCommand; //filling the commands with no commands initially
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command command) { //storing the commands
		Commands[slot] = command;

	}

	public void ButtonWasPushed(int slot) {
		Commands[slot].execute();
		cmdList.add(Commands[slot]);
		unSlot++;
	}


	public void undoButtonWasPushed() {

		unSlot--;
		if (unSlot <= 0) {
			System.out.println("Impossible"); //according to the task if there are no more commands to undo it should return impossible, 
											// therefore we decided to allow robot undo all actions until the first initial ON command.
											// if it was able to undo initial ON command it wouldn't be able to print 'impossible' cause it shouldn't do anything while OFF
			unSlot++;
		} else {
			undoCommand = cmdList.get(unSlot);
			undoCommand.undo();
			undoCommand = cmdList.remove(unSlot);
		}
	}
}