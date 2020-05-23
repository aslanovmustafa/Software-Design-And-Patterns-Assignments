import java.io.IOException;

import java.util.ArrayList;

import java.util.ListIterator;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

//Adaptee class
public class XMLUser implements XMLManager {


	// Storing parsed XML file inside file arraylist
	public  ArrayList<String> file = parse();
	// Using iterator to iterate through arraylist of XML items
	ListIterator<String> list = file.listIterator();

	// Parsing XML file using XMLParser handler class and storing result inside arraylist
	public ArrayList<String> parse() {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			XMLParser handler = new XMLParser();

			saxParser.parse("config.xml", handler);
			ArrayList<String> lines = new ArrayList<String>(handler.getUIList());
			
			return lines;
			
		} catch (IOException e) {

		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		} catch (SAXException e) {
		
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public boolean hasMoreXMLItems() throws IOException, SAXException {

		if (list.hasNext()) {

			return true;
		}
		return false;
	}

	@Override
	public String nextXMLItem() throws IOException {

		while (list.hasNext()) {
			String item = list.next();
			return item;
		}
		return null;
	}

}
