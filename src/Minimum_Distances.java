import java.util.*;
public class Minimum_Distances {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		boolean flag=false;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			int p=A[i];
			for(int j=0;j<i;j++){
				if(p==A[j]){
					int d=Math.abs(j-i);
					if(d<min){
						min=d;
					}
					flag=true;
				}
			}
			for(int j=i+1;j<N;j++){
				if(p==A[j]){
					int d=Math.abs(j-i);
					if(d<min){
						min=d;
					}
					flag=true;
				}
			}
		}
		if(flag==false){
			System.out.println("-1");
		}else{
		System.out.println(min);
		}
		in.close();
	}
}