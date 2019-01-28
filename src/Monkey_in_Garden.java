import java.util.Arrays;
import java.util.Scanner;
public class Monkey_in_Garden {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		System.out.println(traveltime(A,N));
	}
	
	public static int traveltime(int[] input1,int input2){
		Arrays.sort(input1);
		return input1[input2]+input1[input2-1]+1;
	}
}
