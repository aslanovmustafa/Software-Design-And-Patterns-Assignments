
import java.util.ArrayList;

import java.util.Iterator;
import java.util.jar.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLParser extends DefaultHandler implements XML {

	private String ui;
	private String button;
	private String text;
	private String edit;
	private String value;
	private String x;
	private String y;
	private String temp;

	public static ArrayList<String> uiList = new ArrayList<String>();

	@Override
	public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {

		temp = "";

		if (qName.equalsIgnoreCase("uiitem")) {

			ui = attr.getValue("type");

		}
	}

	/*
	 * When the parser encounters the end of an element, it calls this method
	 */

	@Override
	public void endElement(String uri, String lName, String qName) throws SAXException {

		if (qName.equalsIgnoreCase("value")) {
			value = temp;

		}

		else if (qName.equalsIgnoreCase("x")) {
			x = temp;

		} else if (qName.equalsIgnoreCase("y")) {
			y = temp;

		}

		else if (qName.equalsIgnoreCase("button")) { // Lags behind
			button = temp;
			uiList.add(button);
			uiList.add(value);
			uiList.add(x);
			uiList.add(y);
		} else if (qName.equalsIgnoreCase("textbox")) {
			text = temp;
			uiList.add(text);
			uiList.add(value);
			uiList.add(x);
			uiList.add(y);
		} else if (qName.equalsIgnoreCase("editbox")) {
			edit = temp;
			uiList.add(edit);
			uiList.add(value);
			uiList.add(x);
			uiList.add(y);

		}

	}

	/*
	 * When the parser encounters plain text (not XML elements), it calls(this
	 * method, which accumulates them in a string buffer
	 */

	public void characters(char[] buffer, int start, int length) throws SAXException {

		temp = new String(buffer, start, length);

	}

	// Reads accumulated list
	public ArrayList<String> readList() {
		System.out.println("No of UI items: " + uiList.size() + ".");
		Iterator<String> it = uiList.iterator();
		while (it.hasNext()) {
			System.out.println((it.next()));
		}
		return uiList;

	}
	
	// Returns UI List
	public ArrayList<String> getUIList() {
		return uiList;
	}

}
