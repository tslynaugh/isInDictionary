package isInDictionary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a word: ");
		String word = scan.nextLine();

		scan.close();

		CheckWord check = new CheckWord();

		if (check.checkWord(word))
			System.out.println(word + " is in the English dictionary");

		else
			System.out.println(word + " is not in the English dictionary");
	}

}
