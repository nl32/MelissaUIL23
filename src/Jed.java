import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Jed {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("jed.dat"));
		int num = file.nextInt();
		while(num-- > 0){
			String word = file.next();
			int len = word.length();
			String spa = "";
			for(int z = 0; z < len - 1; z++)
				spa += " ";
			out.println(word + word.charAt(0));
			for(int x = 1; x < len; x++){
				out.println(word.charAt(len - x) + spa + word.charAt(x));
			}
			out.print(word.charAt(0));
			for(int y = len -1 ; y >= 0; y--)
				out.print(word.charAt(y));
			out.println("\n");
		}
	}
}
