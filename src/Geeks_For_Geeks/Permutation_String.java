package Geeks_For_Geeks;
import java.util.Scanner; 
public class Permutation_String {
	public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			String str=in.next();
			char[] A=str.toCharArray();
			permute(A,0,str.length()-1);
			in.close();
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	public static void permute(char[] A,int l,int r){
		if(l==r){
			System.out.println(A.toString());
		}else{
			for(int i=l;i<=r;i++){
				swap(A[l],A[i]);
				permute(A,A[l+1],A[r]);
				swap(A[l],A[i]);
			}
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	public static void swap(char a,char b){
		char temp=a;
		a=b;
		b=temp;
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
}