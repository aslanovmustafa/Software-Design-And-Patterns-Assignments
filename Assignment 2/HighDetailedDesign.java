
public class HighDetailedDesign extends DesignType{
	@Override
	WindowManager createDesignOf(String item) {
		if (item.contains("Button")) {
			return new HighDetailedButton();
		} else if (item.contains("TextBox")) {
			return new HighDetailedTextBox();
		} else if (item.contains("EditBox")) {
			return new HighDetailedEditBox();
		} else return null;
	}

	
	

}
