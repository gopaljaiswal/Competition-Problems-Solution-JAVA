/*Print individual digits as words without using if or switch*/
package Geeks_For_Geeks;
import java.util.Scanner;
public class Individual_digit {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String[] A={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		int p=(int)Math.log10(N)+1;
		int[] digit=new int[p];
		int i=0;
		int j=p-1;
		while(j>=0){
			digit[i]=(int) ((int)N/Math.pow(10,j));
			N=(int) ((int)N%Math.pow(10,j));
			i++;
			j--;
		}
		for(int k=0;k<p;k++){
		System.out.println(A[digit[k]]+"   ");
		}
	}
}
