
import java.util.Random;

public class RandomSentence implements SentenceGen {

	@Override
	public void generate() {
		// Generation specific to the random sentences.
		String sentence = "";
		Random rand = new Random();

		int rand_int = rand.nextInt(RSG.rsgVocabulary.size()) + 1; // creates random number for sentence size which is also always at least 1 word

		for (int i = 0; i <= rand_int; i++) {
			int j = rand.nextInt(RSG.rsgVocabulary.size()); //randomly picks what word comes next
			sentence = sentence + RSG.rsgVocabulary.get(j) + " ";

		}
		sentence = sentence.substring(0, sentence.length() - 1); //removes last space
	    System.out.println(sentence + '.');
	}

}
