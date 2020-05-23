
public class SimplisticDesign extends DesignType{

	@Override
	WindowManager createDesignOf(String item) {
		if (item.contains("Button")) {
			return new SimpleButton();
		} else if (item.contains("TextBox")) {
			return new SimpleTextBox();
		} else if (item.contains("EditBox")) {
			return new SimpleEditBox();
		} else return null;
	}
}
