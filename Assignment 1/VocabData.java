import java.util.ArrayList;

public class VocabData implements Vocabulary {

	public ArrayList<Observer> vocabulary;
	private String word;

	public VocabData() {

		vocabulary = new ArrayList<Observer>();

	}

	public void addGenerator(Observer o) {

		vocabulary.add(o);

	}

	@Override
	public void updateVocabulary(Observer o) {
		for (int i = 0; i < vocabulary.size(); i++) {
			Observer obs = (Observer) vocabulary.get(i);
			obs.update(word);

		}

	}

	public void vocabChanged() {
		updateVocabulary(null);
	}

	public void setVocab(String word) {
		this.word = word;
		vocabChanged();
	}



}
