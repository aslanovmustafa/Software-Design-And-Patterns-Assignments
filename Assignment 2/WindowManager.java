import java.io.IOException;

import org.xml.sax.SAXException;

public class WindowManager { 
	

	//Window Manager is a singleton since only one one window at a time can be available. 
	protected static WindowManager uniqueInstance;

	  protected WindowManager() {
	  }

	  public static synchronized WindowManager getInstance() {
	    if (uniqueInstance == null) {
	      uniqueInstance = new WindowManager();
	    }
	    return uniqueInstance;
	  }

	String name;
	
	// Loads everything inside config files.
	public void loadUI(ConfigManager config) throws IOException, SAXException {
		
		while(config.hasMoreItems()) {
			
		 System.out.println(config.nextItem()); 
			
		}
		
	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
