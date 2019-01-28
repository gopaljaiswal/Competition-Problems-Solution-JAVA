import java.util.Scanner;
public class Plus_Minus {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int p=0,n=0,z=0;
		for(int i=0;i<N;i++){
			int A=in.nextInt();
			if(A>0){
				p++;
			}else if(A<0){
				n++;
			}else{
				z++;
			}
		}
		System.out.printf("%.3f\n",(float)p/N);
		System.out.printf("%.3f\n",(float)n/N);
		System.out.printf("%.3f\n",(float)z/N);	
	}
}
