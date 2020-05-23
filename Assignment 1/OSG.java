import java.util.ArrayList;

public class OSG extends Sentence implements Observer{

	public Vocabulary voc; //Vocabulary instance
	public String word;
	public static ArrayList<String> osgVocabulary = new ArrayList<String>();

	public OSG(Vocabulary voc) {
		sg = new OrderedSentence(); // Using the strategy pattern and initializing the ordered sentence "behaviour"
		oEdit = new reverseWord();
		cEdit = new upperCase();// class

		this.voc = voc; // subscribing to the vocab
		voc.addGenerator(this); // adding a generator
	}
	@Override
	public void update(String word) {

		this.word = word;

		osgVocabulary.add(performEdit(performOrderEdit(word)));

	}
}
