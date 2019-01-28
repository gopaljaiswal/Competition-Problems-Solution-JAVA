import java.util.*;
public class The_Lost_Arithmetic_Sequences {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			get_result(A);
		}
		in.close();
	}
	
	public static void get_result(int[] A){
		int[] d=new int[A.length-1];
		
		for(int i=1;i<A.length;i++){
			d[i-1]=A[i]-A[i-1];
		}
		int count=0,ind=0;
		boolean flag=false;
		for(int i=1;i<A.length-3;i++){
			if(d[i]!=d[i+1]){   
				count+=1;
				ind=(i+1);
			}
			if(count>2){
				flag=false;
				break;
			}
		}
		if(true){
			if(d[0]!=d[1] && d[0]!=d[2]){
				if(count>=2){
					System.out.println("-1");
				}else{
					System.out.println(A[0]);
				}
				
			}else if(d[A.length-2]!=d[1] && d[A.length-2]!=d[2]){
				if(count>=2){
					System.out.println("-1");
				}else{
					System.out.println(A[A.length-1]);
				}
			}
			else{
				System.out.println(ind);
				}
			}else{
				System.out.println("-1");
			}
	}
}

