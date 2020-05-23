
public class FuturisticDesign extends DesignType{ // New Franchise //the factory // concrete factory
	
	
	@Override
	WindowManager createDesignOf(String item) {// instead of String item, it reads a config file...
		
		if (item.contains("Button")) { 
			return new FuturisticButton();
		} else if (item.contains("TextBox")) {
			return new FuturisticTextBox();
		} else if (item.contains("EditBox")) {
			return new FuturisticEditBox();
		} else return null;
	}


	
	

}
