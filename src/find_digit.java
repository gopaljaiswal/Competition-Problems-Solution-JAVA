import java.util.Scanner;
import java.lang.Math;

public class find_digit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			check(N);
		}
	}

	public static void check(int N) {
		int l = (int) Math.log10(N) + 1;
		int p = N, count = 0, q;
		for (int i = 0; i < l; i++) {

			q = p % 10;
			p = (int) p / 10;
			// System.out.println(q);
			if (q != 0 && N % q == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	/*
	 * static void check(int N){ int count1=0; int count2=0; int
	 * length=(int)Math.log10(N)+1; while(length>=1){ if(length<=1){ int
	 * p=N%(int)Math.pow(10,1); if(p>0){ if(N%p==0) { count1=count1+1; } //
	 * System.out.println(count1); }} else{ int p=N/(int)Math.pow(10,length-1);
	 * if(p>0){ if(N%p==0 && p>0){ count2=count2+1; }} //
	 * System.out.println(count2); N=N-p*(int)Math.pow(10,length-1);
	 * //System.out.println(N); } length--; } System.out.println(count1+count2);
	 * //return count1+count2; }
	 */
}
