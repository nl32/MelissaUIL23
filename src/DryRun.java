import java.util.Scanner;
import static java.lang.System.out;

public class DryRun {
	public static void main(String[] args) {
		Scanner kb = new Scanner("dryrun.dat");
		int n = kb.nextInt(); kb.nextLine();
		for (int i = 0; i<n; i++) {
			out.println("I like "+kb.next()+".");
		}
	}
}
