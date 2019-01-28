import java.util.*;
public class Cryptoperm {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str1=in.next();
			String str2=in.next();
			int N=in.nextInt();
			ans(str1,str2,N);
		}
	}
	
	public static void ans(String str1,String str2,int N){
		Set set=new HashSet();
		Set set1=new HashSet();
		for(int i=97;i<123;i++){
			boolean flag=false;
			for(int j=0;j<str1.length();j++){
				if(i==str1.charAt(j)){
					flag=true;
					break;
				}
			}
			if(flag==false){
				set.add((char)i);
			}
			
			boolean flag1=false;
			for(int j=0;j<str2.length();j++){
				if(i==str2.charAt(j)){
					flag1=true;
					break;
				}
			}
			if(flag1==false){
				set1.add((char)i);
			}
		
		}
		
		Object[] newArray = (Object[]) set.toArray();
        char[] A=new char[set.size()];
		for(int z = 0; z < A.length; z++)
		{
			A[z]=(char)newArray[z];
			//System.out.println(A[z]);
		}
		
		Object[] newArray1 = (Object[]) set1.toArray();
        char[] B=new char[set1.size()];
		for(int z = 0; z < B.length; z++)
		{
			B[z]=(char)newArray1[z];
		}
		
		for(int j=0;j<N-1;j++){
			B=nextPermutation(B);
		}
		System.out.println();
		int len=B.length;
		for(int k=0;k<len;k++){
			
		}
		
		
	}
	
	public static char[] nextPermutation(char[] array) {
		// Find non-increasing suffix
		char[] A=new char[0];
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		if (i <= 0)
			return A;
		
		// Find successor to pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		
		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return array;
	}
}