import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ListIterator;


public class Config implements ConfigManager {

	public final ArrayList<String> file = readLines(); // Stores read config file
	ListIterator<String> list = file.listIterator(); // Iterates through stored config file

	public ArrayList<String> readLines() { // Reads config file
		
		try {
			ArrayList<String> lines = new ArrayList<>(
					Files.readAllLines(Paths.get("configFile.txt")));

			return lines;
		} catch (IOException e) {
			// handle exception
		}
		return null;
	}

	public boolean hasMoreItems() throws IOException { // Uses iterator's methods

		if (list.hasNext()) {
			return true;
		}
		return false;
	}

	public String nextItem() throws IOException {

		while (list.hasNext()) {
			String item = list.next();
			return item;
		}

		return null;

	}


	

}
