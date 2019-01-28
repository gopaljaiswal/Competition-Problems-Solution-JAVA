import java.util.*;
public class Maximum_difference {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		Arrays.sort(A);
		int[] A1=new int[N];
		int q=0;
		for(int i=A.length-1,j=0;j<A1.length && i>=0;j+=2,i--){
			A1[j]=A[i];
			q=i;
		}
		
		int s1=A.length-q+1;
		if(A.length%2!=0){
			s1=s1-1;
		}
		
		for(int i=0,j=1;j<A1.length && i<A.length;j+=2,i++){
			A1[j]=A[i];
		}
		
		for(int i=0;i<A1.length;i++){
			System.out.println(A1[i]);
		}
		int sum=0;
		for(int j=1;j<A1.length;j++){
			int s11=Integer.max(A1[j],A1[j-1]);
			int s=A1[j]-A1[j-1];
			if(s<0){
				s=Math.abs(s);
			}
			sum+=s;
		}
		
		System.out.println(sum);
		
		in.close();
	}
}