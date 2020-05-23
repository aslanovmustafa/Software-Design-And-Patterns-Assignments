import java.util.ArrayList;

public class RSG extends Sentence implements Observer {

	public Vocabulary voc;
	public String word;
	public static ArrayList<String> rsgVocabulary = new ArrayList<String>(); //Static array list for inter-class access.

	public RSG(Vocabulary voc) {
		sg = new RandomSentence(); // Using the strategy pattern and initializing the random sentence "behaviour" class
		cEdit = new lowerCase();
		this.voc = voc; // subscribing to the vocab
		voc.addGenerator(this); // add generator...

	}

	public void update(String word) {

		this.word = word;
		// Changing words to lower case and adding to RSG's internal vocabulary
		rsgVocabulary.add(performEdit(word));

	}

}
