import java.util.*;
public class Faded_Palindromes {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			isPallindrom(str);
			System.out.println();
		}
		in.close();
	}

	public static void isPallindrom(String str){
		boolean flag=true;
		char[] A=new char[str.length()];
		for(int i=0;i<A.length;i++){
			A[i]=str.charAt(i);
		}
		if(((A.length-1) % 2==0) && (A[(A.length-1)/2]=='.')){
			A[(A.length-1)/2]='a';
		}
		for(int i=0;i<(int)A.length/2;i++){
			if((A[i]=='.') && (A[A.length-1-i]=='.')){
				A[i]='a';
				A[A.length-1-i]='a';
			}else if((A[i]!=A[A.length-1-i]) && (A[i]=='.')){
				A[i]=A[A.length-1-i];
			}else if((A[i]!=A[A.length-1-i]) && (A[A.length-1-i]=='.')){
				A[A.length-1-i]=A[i];
			}else if((A[i]!=A[A.length-1-i] && A[i]!='.') || ((A[i]!=A[A.length-1-i] && A[A.length-1-i]!='.'))){
				flag=false;
				break;
			}
		}
		if(flag==false){
			System.out.println("-1");
		}else{
			for(int i=0;i<A.length;i++){
				System.out.print(A[i]);
			}
		}
		
	}
	
}
