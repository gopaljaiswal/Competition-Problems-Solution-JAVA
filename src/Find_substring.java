import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Find_substring {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			find_string(str);
			System.out.println();
		}
		in.close();
	}
///////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void find_string(String str){
		int N=str.length();
		int count=0;
		if(N==1){
			count=1;
		}else if(N==2){
			count=N+(N-1);
		}else{
			count=N+(N-1);
			for(int i=0;i<N-2;i++){
				for(int j=i+2;j<N;j++){
					String st=str.substring(i,j+1);
					//System.out.println(st);
					char[] A=st.toCharArray();
					//System.out.println(A.length);
					Set<Character> set=new HashSet<Character>();
					for(int k=0;k<A.length;k++){
						set.add(new Character(A[k]));
					}
					//System.out.println(set);
					if(set.size()<3){
						//System.out.println(count+"     "+set+"     "+set.size());
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
