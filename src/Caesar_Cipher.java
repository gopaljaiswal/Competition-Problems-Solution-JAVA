import java.util.Scanner;
public class Caesar_Cipher {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String str=in.next();
		int K1=in.nextInt();
		while(K1>26){
			K1=K1-26;
		}
		int K=K1;
		//System.out.println(K);
		for(int i=0;i<str.length();i++){
			int p=(int)str.charAt(i);
			if((p>=65 && p<=90)){
				int str1=p+K;
				if(str1>90){
					str1-=26;
					System.out.print((char)str1);
				}else{
					System.out.print((char)str1);
				}
			}else if(p>=97 && p<=122){
				int str1=p+K;
				if(str1>122){
					str1-=26;
					System.out.print((char)str1);
				}else{
					System.out.print((char)str1);
				}
			}
			else{
				System.out.print((char)str.charAt(i));
			}
		}
	}
}
