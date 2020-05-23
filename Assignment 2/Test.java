
public class Test {
	public static void main(String[] args) throws Exception {

		DesignType dp = new FuturisticDesign(); // creating new design, new concrete factory.

		WindowManager wm = WindowManager.getInstance(); // getting window instance

		// Loading UI from txt config file
		ConfigManager c = new Config(); // Config class loades txt files
		ConfigManager c1 = new Config();
		
		System.out.println("Loading all the UI items from config file:");
		wm.loadUI(c); // Loading all the UI items inside regular config file (txt)

		// Loading UI from XML aka Config file
		XMLManager xm = new XMLUser(); // Getting new instance of adaptee

		ConfigManager cm1 = new ConfigXMLAdapter(xm); // Passing the adaptee as a ConfigManager type through the adapter
														// class.
		System.out.println("Loading all the UI items from XML config file:");
		wm.loadUI(cm1); // Loading all the UI items from XML file

		// Creating Items Programmatically
		System.out.println("Creating UI items:");
		while (c1.hasMoreItems()) {

			wm = dp.create(c1.nextItem()); // Using the selected design type, creating new UI item
			System.out.println("\nWow look at this " + wm.getName()); 
		}

	}
}