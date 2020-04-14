//command to turn ON robot

public class powerOnCommand implements Command {
  power p;
  
  public powerOnCommand(power p) {
    this.p = p;
  }
  
  public void execute() {
    p.on();
  }
  
  @Override
  public void undo() {
	  p.off();
  }
  
  
}