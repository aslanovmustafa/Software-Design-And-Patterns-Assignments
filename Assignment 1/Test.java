import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// You can test everything here

		try (Scanner sc = new Scanner(System.in)) {
			VocabData vocData = new VocabData();
			String wordInput;
			int numericInput;
			String sentinel = "0";

			RSG rand = new RSG(vocData);
			SSG sort = new SSG(vocData);
			OSG order = new OSG(vocData);

			System.out.println("If you want to stop entering words, type \"0\". \nEnter the words: ");
			wordInput = sc.nextLine();
			while (!wordInput.equals(sentinel)) {

				vocData.setVocab(wordInput);
				wordInput = sc.nextLine();
			}

			System.out.println(
					"Which of the sentence generations you want to perform? Type the number of corresponding generator:"
							+ "\n1. Random Sentence Generator" + "\n2. Sorted Sentence Generator"
							+ "\n3. Ordered Sentence Generator" + "\n4. All three" + "\n0. Exit");

			loop: while (sc.hasNextInt()) {
				numericInput = sc.nextInt();
				switch (numericInput) {
				case 1:
					rand.performGeneration();
					break;
				case 2:
					sort.performGeneration();
					break;
				case 3:
					order.performGeneration();
					break;
				case 4:
					rand.performGeneration();
					sort.performGeneration();
					order.performGeneration();
					break;
				case 0:
					break loop;
				default:
					System.out.println("Wrong number, try again.");

				}
			}
			sc.close();
		}
	}
}
