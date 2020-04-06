public class moveForwardCommand implements Command {
  move mf;
  
  public moveForwardCommand(move mf) {
    this.mf = mf;
  }
  
  public void execute() {
    mf.forward();
  }
  
  @Override
  public void undo() {
	  //here we add function to remove x or y
  }
}