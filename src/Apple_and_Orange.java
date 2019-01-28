import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Apple_and_Orange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int appleCount=0;
		int orrngeCount=0;
		
		int s = in.nextInt();
		int t = in.nextInt();

		int a = in.nextInt();
		int b = in.nextInt();

		int m = in.nextInt();
		int n = in.nextInt();
		int[] apples = new int[m];
		for (int i = 0; i < m; i++) {
			apples[i] = a + in.nextInt();
			if(apples[i]>=s && apples[i]<=t){
				appleCount++;
			}
		}
		int[] oranges = new int[n];
		for (int i = 0; i < n; i++) {
			oranges[i] = b + in.nextInt();
			if(oranges[i]>=s && oranges[i]<=t){
				orrngeCount++;
			}
		}

		System.out.println(appleCount);
		System.out.println(orrngeCount);
		in.close();
	}

}
