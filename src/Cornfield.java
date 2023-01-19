import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cornfield {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("cornfield.dat"));
		int cases = kb.nextInt();
		for (int i = 0; i < cases; i++) {
			int depth = kb.nextInt();
			int width = kb.nextInt(); kb.nextLine();
			for (int j = 0; j < depth; j++) {
				String[] line = kb.nextLine().split("");
				for (int k = 0; k < line.length; k++) {
					if(line[k].equals("@")){
						System.out.printf("[%d,%d]\n",j,k);
					}
				}

			}
		}
	}
}
