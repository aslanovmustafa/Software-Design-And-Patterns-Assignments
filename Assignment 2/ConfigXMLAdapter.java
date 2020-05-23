import java.io.IOException;


import java.util.ArrayList;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Implementing interface of the type we're adapting to - ConfigManager
public class ConfigXMLAdapter extends DefaultHandler implements ConfigManager {

	XMLManager xm; // Passing reference to the adaptee
 
	public ConfigXMLAdapter(XMLManager xm) {


		this.xm = xm;

	}

	@Override
	public boolean hasMoreItems() throws IOException, SAXException {

		return xm.hasMoreXMLItems();

	}

	@Override
	public String nextItem() throws IOException {

		return (xm.nextXMLItem());
	}

	@Override
	public ArrayList<String> readLines() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
