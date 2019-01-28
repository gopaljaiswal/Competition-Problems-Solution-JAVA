import java.util.Arrays;
import java.util.Scanner;
public class Median {
	static Scanner in=new Scanner(System.in);
	static int top=0;
	static int N=in.nextInt();
	static int[] S=new int[N];
	public static void main(String[] args){
		char[] A=new char[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.next().charAt(0);
			B[i]=in.nextInt();
		}
		display_result(A,B);
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void display_result(char[] A,int[] B){
		for(int i=0;i<N;i++){
			if(A[i]=='a'){
				S=Add_in_list(B[i]);
				for(int l=0;l<top;l++){
					System.out.print(S[l]+" ");
				}
				get_median(S);
			}
			else if(A[i]=='r'){
				int m=0;
				int p=remove_from_list(B[i]);
				for(int j=0;j<p;j++){
					S[m++]=S[j];
				}
				for(int j=p+1;j<N;j++){
					S[m++]=S[j];
				}
				for(int l=0;l<m;l++){
					System.out.print(S[l]+" ");
				}
				if(m==0){
					System.out.println("wrong");
				}else{
					get_median(S);
				}
			}
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int remove_from_list(int b){
		for(int i=0;i<N;i++){
			if(S[i]==b){
				return i;
			}
		}
		return 0;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int[] Add_in_list(int value){
		S[top]=value;
		top=top+1;
		return S;
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void get_median(int[] A){	
	Arrays.sort(A);
	int n=A.length;
	if(n%2!=0){
		int p=n/2;
		System.out.println(A[p]);
	}
	else{
		int i=n/2;
		int p=(A[i-1]+A[i]);
		float q=p/2F;
		System.out.printf("%f",q);
	}
}
}
