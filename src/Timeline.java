import java.io.File;
import java.io.FileNotFoundException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Timeline {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("timeline.dat"));
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			kb.next();
			long period = kb.nextLong()*12;
			ZonedDateTime date = ZonedDateTime.of(1975,7,1,0,0,0,0, ZoneId.systemDefault())
					.plusDays(period);
			System.out.printf("%d/%d/%d\n",date.getMonthValue(),date.getDayOfMonth(),date.getYear());


		}
	}
}
