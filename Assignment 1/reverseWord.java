//reverses the word
public class reverseWord implements orderEdit {
	@Override
	public String editOrder(String word) {
		String reversedWord = "";
		for(int i = word.length() - 1; i >= 0; i--)
        {
			reversedWord = reversedWord + word.charAt(i);
        }
		return word = reversedWord;
	}

	
}
