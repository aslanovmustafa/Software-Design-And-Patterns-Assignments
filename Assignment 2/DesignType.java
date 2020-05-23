
public abstract class DesignType {

	public WindowManager create(String name) { 
		WindowManager WM;

		WM = createDesignOf(name);

		return WM;

	}

	abstract WindowManager createDesignOf(String name);

}
