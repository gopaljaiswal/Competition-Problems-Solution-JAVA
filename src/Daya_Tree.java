import java.util.Scanner;
public class Daya_Tree {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long N=in.nextLong();
			get_hieght(N);
		}
	}
////////////////////////////////////////////////////////////////////////////////////
public static void get_hieght(long N){
		int ht=0;
	    for(int i=1;i<=N;i++){
		String str=Integer.toBinaryString(i);
		int p=0;
		for(int j=0;j<str.length();j++){
			if(str.charAt(j)=='1'){
				p++;
			}
		}
		if(p%3==0){
			ht++;
		}	}System.out.println(ht);}
}
/////////////////////////////////////////////////////////////////////////////////////	