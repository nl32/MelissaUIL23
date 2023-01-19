import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Norman {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("norman.dat"));
		int n = kb.nextInt();
		int get;
		for (int i = 0; i<n; i++) {
			get = kb.nextInt();
			if (get==13)
				System.out.println("BAD LUCK");
			else if (get%2==0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		}
	}
}
