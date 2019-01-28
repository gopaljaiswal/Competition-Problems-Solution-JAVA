import java.util.*;
public class Chef_and_digits_of_a_number {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			//int N=in.nextInt();
			String str=in.next();
			get(str);
		}
		in.close();
	}
	
	public static void get(String str){
		int count_0=0,count_1=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='0'){
				count_0++;
			}else{
				count_1++;
			}
		}
		//System.out.println(((count_0<=1) && (count_1>1)) || ((count_0>1) && (count_1<=1)));
		if((count_0==1) || (count_1==1)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		//System.out.println(count_0+"    "+count_1);
	}

}
