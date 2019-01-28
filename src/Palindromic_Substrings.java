import java.util.*;
public class Palindromic_Substrings {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			StringBuffer buffer = new StringBuffer(in.next());
			StringBuffer buffer1 = new StringBuffer(in.next());
			buffer1.reverse();
			get(buffer,buffer1);
		}	
		in.close();
	}
	
	public static void get(StringBuffer str,StringBuffer str1){
		boolean flag=false;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String str2=str.substring(i,j);
				System.out.println(str2+"  ");
				
				for(int k=0;k<str1.length();k++){
					for(int l=k+1;l<=str1.length();l++){
						String str3=str1.substring(k,l);
						
						//System.out.println(str3+"  ");
						
						if(str2.equals(str3)){
						//	System.out.println("\n\n"+str2+" "+str3);
							flag=true;
							break;
						}
					}
				}
			}
		}
		if(flag==true){
			System.out.println("Yes");
		}else if(flag==false){
			System.out.println("No");
		}
	}
}