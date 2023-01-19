import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Order {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("order.dat"));
		int count;
		String word;
		int n = kb.nextInt();
		for (int i = 0; i<n; i++) {
			word = kb.next();
			count = 0;
			for (int a = 0; a < word.length(); a++) {
				for (int b = a; b < word.length(); b++) {
					if (word.substring(a,a+1).equals(word.substring(b,b+1)))
						count++;
				}
			}
			System.out.println(count);
		}

	}
}
