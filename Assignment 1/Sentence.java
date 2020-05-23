
public abstract class Sentence {

	SentenceGen sg; // Instance of sentence generation behaviour interface, as per the Strategy pattern
	caseEdit cEdit;
	orderEdit oEdit;
	
	public void performGeneration() { 
		sg.generate();

	}
	
	public String performEdit(String word) {
		return cEdit.editCase(word);
	}
	
	public String performOrderEdit(String word) {
		return oEdit.editOrder(word);
	}

}
