import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class PremTest23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		list.add("pa");
		list.add("ap");
		list.add("qa");

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		System.out.println(list);
		in.close();
	}

}
