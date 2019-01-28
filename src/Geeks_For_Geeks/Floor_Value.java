package Geeks_For_Geeks;
import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////
public class Floor_Value {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int x=in.nextInt();
		System.out.println("floor value="+floor(A,x,A.length));
	}
///////////////////////////////////////////////////////////////////////////////////////////////	
public static int floor(int[] A,int x,int size){
		if(x<A[0]){
			return -1;
		}
		else 
		{
			return floor1(A,x,0,A.length);
		}
}
////////////////////////////////////////////////////////////////////////////////////////////////

public static int floor1(int[] A,int x,int l,int r){
	while((r-l)>1){
		int mid=l+(r-l)/2;
		if(A[mid]<=x){
			l=mid;
		}else{
			r=mid;
		}
	}
	return A[l];
}
}
////////////////////////////////////////////////////////////////////////////////////////////////