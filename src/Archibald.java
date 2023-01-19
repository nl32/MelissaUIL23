import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archibald {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("archibald.dat"));
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			int curr = kb.nextInt();
			for (int j = 0; j < curr+1; j++) {
				String s = "";
				for (int k = 1; k < j+1; k++) {
					s += "@";
				}
				System.out.println(s);
			}
		}
	}
}
