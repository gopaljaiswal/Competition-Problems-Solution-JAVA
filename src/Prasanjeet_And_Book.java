import java.util.Scanner;
public class Prasanjeet_And_Book {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int k=0;k<T;k++){
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		get_min(A);}
	}
/////////////////////////////////////////////////////////////////////////////////////
	public static void get_min(int[] A){
		int min=0;
		int pos=0;
		int j=1; 
		while(j<=A.length){
			for(int i=0;i<A.length;i++){
				if(j==A[i] && pos<=i){
					if(min+1==j){
						min=j;
						pos=i;
						continue;
					}else{break;}}
			}j++;
		}
		System.out.println(A.length-min);
	}}
////////////////////////////////////////////////////////////////////////////////////////////