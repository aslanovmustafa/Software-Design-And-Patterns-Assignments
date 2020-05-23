
public class OrderedSentence implements SentenceGen {

	@Override
	public void generate() {
		// Generation specific to the ordered sentences.
		String sentence = "";
		for (int i = 0; i < OSG.osgVocabulary.size(); i++) {
			sentence = sentence + OSG.osgVocabulary.get(i) + " "; //creates sentence based on the words in vocabulary as they were added
		}
		sentence = sentence.substring(0, sentence.length() - 1); // removes last space
		System.out.println(sentence + '.');
	}

}
