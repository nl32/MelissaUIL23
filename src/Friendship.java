import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Friendship {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("friendship.dat"));
		int sets = kb.nextInt(); kb.nextLine();
		for (int i = 0; i < sets; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			String[] temps = kb.nextLine().split(" ");
			for (String temp : temps) {
				list.add(Integer.parseInt(temp));
			}
			list.sort(Collections.reverseOrder());
			System.out.println("Hottest Temp - " + list.get(0));
		}

	}
}
