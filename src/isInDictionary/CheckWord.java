package isInDictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckWord {

	private String word;

	public CheckWord() {

	}

	public boolean checkWord(String word) {
		File file = new File("dictionary");
		this.word = word;
		
		word.toLowerCase();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;

			while ((str = br.readLine()) != null) {
				if (str.indexOf(word) != -1)
					return true;
			}
			br.close();

		} catch (IOException e) {
			System.out.println("IOException");
		}

		return false;
	}

}
