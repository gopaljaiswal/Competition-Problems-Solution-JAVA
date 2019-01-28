//https://practice.geeksforgeeks.org/problems/maximum-tip-calculator/0
/**
 * 
 */
package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
class Maximum_Tip_Calculator {
	int max = 0;

	public static void main(String[] args) throws IOException {
		// code
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bi.readLine());

		while (T-- > 0) {

			String[] nCapACapB = bi.readLine().split(" ");

			int N = Integer.parseInt(nCapACapB[0]);
			int X = Integer.parseInt(nCapACapB[1]);
			int Y = Integer.parseInt(nCapACapB[2]);

			int[] A = new int[N];
			int[] B = new int[N];

			String[] tipsAStrs = bi.readLine().split(" ");

			String[] tipsBStrs = bi.readLine().split(" ");
			
			int[] D = new int[N];
			
			for (int j = 0; j < N; j++) {
				A[j] = Integer.parseInt(tipsAStrs[j]);
				B[j] = Integer.parseInt(tipsBStrs[j]);
				D[j] = A[j] - B[j];
			}

			int tot = 0;
			
			for (int i = 0; i < N; i++) {
				int index = findIndex(D);

				if (index == -1) {
					for (int j = 0; j < N; j++) {
						tot += A[j];
					}
					break;
				} else if (D[index] > 0) {
					if (X > 0) {
						tot += A[index];
						D[index] = 0;
						A[index] = 0;
						B[index] = 0;
						X--;
					} else {
						for (int j = 0; j < N; j++) {
							tot += B[j];
						}
						break;
					}
				} else {

					if (Y > 0) {
						tot += B[index];
						D[index] = 0;
						B[index] = 0;
						A[index] = 0;
						Y--;
					} else {
						for (int j = 0; j < N; j++) {
							tot += A[j];
						}
						break;
					}
				}
			}

			System.out.println(tot);
		}
	}

	static int findIndex(int D[]) {
		int current = 0;
		int index = -1;
		for (int i = 0; i < D.length; i++) {
			int x = Math.abs(D[i]);
			if (x > current) {
				current = x;
				index = i;
			}
		}
		return index;
	}
}


//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class GFG {
//	public static void main (String[] args) {
//		Scanner scan= new Scanner(System.in);
//		int cases=scan.nextInt();
//		scan.nextLine();
//		while(cases>0) {
//		    cases--;
//		    int n=scan.nextInt();
//		    int x=scan.nextInt();
//		    int y=scan.nextInt();
//		    if(y<n-x) {
//		        y=n-x;
//		    }
//		    scan.nextLine();
//		    String[] stra=scan.nextLine().split(" ");
//		    int[] A = new int[n];
//		    int[] B = new int[n];
//		    
//		    for(int i=0;i<n;i++) {
//		        A[i]=Integer.parseInt(stra[i]);
//		    }
//		   
//		    String[] strb=scan.nextLine().split(" ");
//		    for(int i=0;i<n;i++) {
//		        B[i]=Integer.parseInt(strb[i]);
//		    }
//		   
//		   System.out.println(GFG.maxTip(n-1, x, y, A, B));
//		    
//		}
//	}
//	
//	public static int maxTip(int ind, int x, int y, int[] A, int [] B) {
//	    if (ind < 0) return 0;
//	    
//	    if(x <= 0) {
//	        return B[ind] + maxTip(ind-1, x, y-1, A, B);
//	    } else if (y <= 0) {
//	        return A[ind] + maxTip(ind-1, x-1, y, A, B);
//	    }
//	    
//	    int tipWithA = A[ind] + maxTip(ind-1, x-1, y, A, B);
//	    int tipWithB = B[ind] + maxTip(ind-1, x, y-1, A, B);
//	    
//	    return Math.max(tipWithA, tipWithB);
//	}
//}
