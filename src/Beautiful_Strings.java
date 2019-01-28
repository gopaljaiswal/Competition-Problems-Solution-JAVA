import java.util.*;
public class Beautiful_Strings {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			check(str);
		}
		in.close();
	}
	
	public static void check(String str){
		char[] A=str.toCharArray();
		int count=0;
		if(A[0]!='a'){
			A[0]='a';
			count++;
		}
		for(int i=1;i<A.length;i++){
			char p=A[i];
			if(p=='b'){
				if(A[i-1]!='a'){
					count++;
				}
			}
			if(p=='c'){
				if(A[i-1]!='b'){
					count++;
				}
			}
			if(p=='a'){
				if(A[i-1]!='c'){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
