import java.io.IOException;
import java.util.ArrayList;


import org.xml.sax.SAXException;

public interface ConfigManager {

	public  ArrayList<String> readLines() throws IOException;

	public boolean hasMoreItems() throws IOException, SAXException;

	public String nextItem() throws IOException;
	

}
