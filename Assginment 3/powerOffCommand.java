public class powerOffCommand implements Command {
  power p;
  
  public powerOffCommand(power p) {
    this.p = p;
  }
  
  public void execute() {
    p.off();
  }
  
  @Override
  public void undo() {
	  p.on();
  }
  
  
}