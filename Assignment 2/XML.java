import java.util.ArrayList;
import java.util.jar.Attributes;

import org.xml.sax.SAXException;

public interface XML {
	
	public static ArrayList<String> uiList = new ArrayList<String>();

	public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException;

	public void endElement(String uri, String localName, String qName) throws SAXException;
	
	void characters(char[] ch, int start, int length) throws SAXException;
	public ArrayList<String> readList();


	public ArrayList<String> getUIList();


}
