import java.util.*;
public class Repeated_String {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
	
		long p=in.nextLong();
		long count=0;
		if(str.length()==1){
			if(str.charAt(0)=='a'){
				count+=p;
			}else{
				count=0;
			}
		}else{
		long count1=0;	
		//String str1="";
		long q=p/str.length();
		long r=p%str.length();
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='a'){
				if(i<r){
					count1++;
					count++;
				}else{
				count++;
				}
			}
		}
		count=q*count;
		count=count+count1;
		/*for(int i=0;i<r;i++){
			if(str.charAt(i)=='a'){
				count++;
			}
			str1+=str.charAt(i);
		}*/
		//System.out.println(q+"    "+r);
		//System.out.println(str1);
		
		/*for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)=='a'){
				count++;
			}
		}*/
	}
		System.out.println(count);
		in.close();
	}

}
