import java.util.Random;

public class SortedSentence implements SentenceGen {

	@Override
	public void generate() {
		//Generation specific to the sorted sentences. 
		Random rand = new Random();
		String temp;
		int rand_int = rand.nextInt(SSG.ssgVocabulary.size()) + 1; // creates random number for sentence size which is also always at least 1 word
		String sentenceArray[] = new String[rand_int]; //creates array of a sentence
		String sentence = "";

		for (int i = 0; i < rand_int; i++) {
			int j = rand.nextInt(SSG.ssgVocabulary.size());
			sentenceArray[i] = SSG.ssgVocabulary.get(j); //randomly creates sentence which is also array
		}

		for (int i = 0; i < rand_int; i++) {
			for (int j = i + 1; j < rand_int; j++) {
				if (sentenceArray[i].compareTo(sentenceArray[j]) > 0) { //checks if the sentence is sorted alphabetically
					temp = sentenceArray[i];
					sentenceArray[i] = sentenceArray[j];
					sentenceArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < rand_int; i++) {
			sentence = sentence + sentenceArray[i] + " "; //makes array to string
		}
		sentence = sentence.substring(0, sentence.length() - 1); //removes last space
	    System.out.println(sentence + '.'); 

	}

}
