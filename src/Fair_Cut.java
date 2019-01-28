import java.util.Scanner;
import java.util.*;
public class Fair_Cut {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] L=new int[N];
		for(int i=0;i<N;i++){
			L[i]=in.nextInt();
		}
		Arrays.sort(L);
		if(K==1){
			int sum=0;
			int s=L[L.length-1];
			for(int i=0;i<N-1;i++){
				sum+=Math.abs(s-L[i]);
			}
			System.out.println(sum);
		}else{
            
		int[] l1=new int[K];
		int[] l2=new int[N-K];
		int j=0,k=0;
		for(int i=0;i<N;i++){
			if(i<K){
				l1[i]=L[i];
			}else{
				l2[i-K]=L[i];
			}
		}
		
		for(int i=0;i<l1.length;i++){
			System.out.print(l1[i]);
		}
		System.out.println();
		for(int i=0;i<l2.length;i++){
			System.out.print(l2[i]);
		}
            //System.out.println(findMinDiff(l1,l2));
	/*	Arrays.sort(l1);
		Arrays.sort(l2);
		int sum=0;
		for(int i=0;i<l1.length;i++){
			int s=l1[i];
			for(int j1=0;j1<l2.length;j1++){
				sum+=Math.abs(s-l2[j1]);
			}
		}*/
		//System.out.println(sum);
		}
		in.close();
	}
    public static int findMinDiff(int[] array1, int[] array2)
    {
        int i = 0, j = 0;
        int minDiff = Integer.MAX_VALUE;

        while ( i < array1.length && j < array2.length )
        {
            if( array1[i] == array2[j] )
                return 0;

            int diff = Math.abs( array1[i] - array2[j] );
            minDiff = Math.min( diff, minDiff );

            if( array1[i] > array2[j] )
                j++;
            else
                i++;

        }

        if( i < array1.length ) //array1 has some more elements
        {
            j--; // j has reached the end, move it to last element
            while ( i < array1.length )
            {
                int diff = Math.abs( array1[i] - array2[j] );
                minDiff = Math.min( diff, minDiff );
                i++;
            }
        }
        else //array2 has some more elements
        {
            i--;
            while ( j < array2.length )
            {
                int diff = Math.abs( array1[i] - array2[j] );
                minDiff = Math.min( diff, minDiff );
                j++;
            }
        }
        return minDiff;
    }

}
