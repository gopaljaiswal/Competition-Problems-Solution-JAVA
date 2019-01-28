import java.util.*;
public class Jumping_on_the_Clouds {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int count=0;
		int i=0,j=0;
		while(i<(N-2)){
			if(A[i+2]==1){
				count++;
				i++;
			}else if(A[i+2]==0){
				count++;
				i+=2;
			}
			j=i;
			//System.out.println(i+" "+count);
		}
	//	System.out.println(j);
		if((N-j-1)==1){
			System.out.println(count+1);
		}else{
			System.out.println(count);
		}	
		in.close();
	}
}