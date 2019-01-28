import java.util.Scanner;
public class Xor_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int L=in.nextInt();
		int R=in.nextInt();
		check_maxxor(L,R);
}
public static void check_maxxor(int L,int R){
	int[] a=new int[1000000];
	int b=0;
	for(int i=L;i<=R;i++){
		for(int j=i;j<=R;j++){
			a[b]=i^j;
			b++;
		}
	}
	
	int max=a[0];
	for(int k=1;k<b;k++){
		if(a[k]>max){
			max=a[k];
		}
	}
	System.out.println(max);
}	
}
