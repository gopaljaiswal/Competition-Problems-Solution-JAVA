import java.util.Arrays;
import java.util.Scanner;
public class flowers{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int sum=0,t=0;
		for(int j=N-1,p=K;j>=0;j--,p--){
			    if(p>1){
			    sum=sum+a[j];}
			    else{
				sum=sum+(t+1)*a[j];
				t++;}
			}
		System.out.println(sum);
}}
