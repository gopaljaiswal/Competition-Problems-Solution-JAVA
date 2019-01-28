import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Mobile_Selection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> os = new ArrayList<String>();
		ArrayList<Integer> ramSize = new ArrayList<Integer>();
		ArrayList<Integer> memSpace = new ArrayList<Integer>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		ArrayList<Integer> rating = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			os.add(in.next());
			ramSize.add(in.nextInt());
			memSpace.add(in.nextInt());
			price.add(in.nextInt());
			rating.add(in.nextInt());
		}

		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			String os1 = in.next();
			Integer ramSize1 = in.nextInt();
			Integer memSpace1 = in.nextInt();
			in.nextLine();
			Boolean flag = false;
			Integer max = Integer.MIN_VALUE;
			for (int j = 0; j < N; j++) {
				if (os.get(0).equals(os1) && ramSize.get(1).equals(ramSize1)
						&& memSpace.get(2).equals(memSpace1) ) {
					flag=true;
					if (rating.get(4) > max) {
						max = rating.get(4);
					}
				}
			}
			if (flag == false) {
				System.out.println("-1");
			} else {
				System.out.println(max);
			}
		}
		in.close();

	}

}
