package Geeks_For_Geeks;
import java.util.Scanner;
//////////////////////////////////////////////////////////////////////////////////////
public class Convert_from_decimal_to_base_given {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int base=in.nextInt();
		convert(N,base);
		in.close();
	}

///////////////////////////////////////////////////////////////////////////////////////
	public static void convert(int N,int base){
		int rem=N%base;
		if(N==0){
			return;
		}
		convert(N/base,base);
		if(rem<10){
			System.out.print(rem);
		}else{
			System.out.printf("%c",(char)rem-10+'A');
		}
	}
}
////////////////////////////////////////////////////////////////////////////////////////