package Geeks_For_Geeks;
import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////
public class Convert_to_decimal {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			String str=in.next();
			int n=in.nextInt();
			get_decimal(str,n);
		}
		in.close();
	}
///////////////////////////////////////////////////////////////////////////////////////	
	public static void get_decimal(String str,int n){
		int sum=0;
		int p;
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)=='A'){
				p=10;
			}else if(str.charAt(i)=='B'){
				p=11;
			}else if(str.charAt(i)=='C'){
				p=12;
			}else if(str.charAt(i)=='D'){
				p=13;
			}else if(str.charAt(i)=='E'){
				p=14;
			}else if(str.charAt(i)=='F'){
				p=15;
			}else{
				p=(int)str.charAt(i)-48;
			}
			int q=str.length()-1-i;
			sum+=p*Math.pow(n,q);
		}
		System.out.println(sum);
	}
}
//////////////////////////////////////////////////////////////////////////////////////