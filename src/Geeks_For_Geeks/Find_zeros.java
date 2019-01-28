/*I would use SLIDING WINDOW for this problem. 
Lets use a window covering from index wL to index wR. Let the number of zeros inside the window be nZero. We try to maintain the window with at most m zeros inside. 
The main steps are: 
- While nZero is no more than m: expand the window to the right (wR++) and update the count nZero; 
- While nZero exceeds m, shrink the window from left (wL++), update nZero; 
- Update the widest window along the way. The positions of must-flip zeros are inside the best window. 
This solution assumes we can use m or less number of flips. 
Time complexity = O(n), space = O(1).
 */
package Geeks_For_Geeks;
import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////
public class Find_zeros {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int m=in.nextInt();
		findZeros(A,A.length,m);
	}
////////////////////////////////////////////////////////////////////////////////////////////////
public static void findZeros(int[] A,int N,int m){
	int wL=0,wR=0;
	int bestL=0,bestWindow=0;
	int zeroCount=0;
	while(wR<N){
		if(zeroCount<=m){
			if(A[wR]==0)
				zeroCount++;
				wR++;
		}
		if(zeroCount>m){
			if(A[wL]==0)
				zeroCount--;
				wL++;
		}
		if((wR-wL)>bestWindow){
			bestWindow=wR-wL;
			bestL=wL;
		}
	}
	for(int i=0;i<bestWindow;i++){
		if(A[bestL+i]==0)
			System.out.println((bestL+i));
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////
}