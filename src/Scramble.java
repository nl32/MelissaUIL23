import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scramble {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("scramble.dat"));
		int n = kb.nextInt();
		String word;
		for (int i = 0; i<n; i++) {
			word = kb.next().toLowerCase();
			if (word.contains("i"))
				System.out.println("milk");
			if (word.contains("g"))
				System.out.println("eggs");
			if (word.contains("h"))
				System.out.println("wheat");
		}
	}
}
