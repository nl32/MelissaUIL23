import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Animal {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("animal.dat"));
		int n = kb.nextInt(); kb.nextLine();
		while(kb.hasNextLine()) {
			System.out.printf("%d Animals\n", kb.nextLine().trim().length());
		}
	}
}
