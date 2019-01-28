import java.util.Scanner;
public class Reverse_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int i=0;
		int[] A=new int[(int)Math.log10(N)+1];
		while(N!=0){
			i++;
			if(i==1){
				System.out.print(N%10);
			}else{
				System.out.print(","+N%10);
			}
			N=(int)N/10;
		}
}
}
