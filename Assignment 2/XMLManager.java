import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

// Adaptee Interface
public interface XMLManager {
	

	public boolean hasMoreXMLItems() throws IOException, SAXException;

	public String nextXMLItem() throws IOException;

	public  ArrayList<String> parse() throws ParserConfigurationException, SAXException, IOException;

}
