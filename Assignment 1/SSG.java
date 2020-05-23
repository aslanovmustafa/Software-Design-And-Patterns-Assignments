import java.util.ArrayList;

public class SSG extends Sentence implements Observer{
		
		public Vocabulary voc;
		public String word;
		public static ArrayList<String> ssgVocabulary = new ArrayList<String>();
		
		
		
		
		public SSG(Vocabulary voc) {
			sg = new SortedSentence(); // Using the strategy pattern and initializing the sorted sentence "behaviour" class
			cEdit = new lowerCase();

			this.voc = voc; // subscribing to the vocab
			voc.addGenerator(this); // add generator...

		}
		
		public void update(String word) {
			
			this.word = word;
			// Changing words to lowercase and adding to SSG's internal vocabulary
			ssgVocabulary.add(performEdit(word));

		}

	
}
