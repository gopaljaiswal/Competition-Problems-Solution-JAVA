import java.util.Scanner;
public class Roy_and_counting_sorted_substring {
	public static void main(String[] args){
		@SuppressWarnings({ "resource" })
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			int a=in.nextInt();
			String str=in.next();
			get_no_str(a,str);
		}				
	}

	public static void get_no_str(int a,String str){
		int p=a;
		boolean flag=false;
		//char[] A=new char[a];
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				String str1=str.substring(i,j+1);
				flag=get_sort(str1);
				//System.out.println(flag+" "+str1);
				if(flag==true){
					p++;
				}
			}
		}
		System.out.println(p);
	}	

	public static boolean get_sort(String str){
		boolean flag=false;
		for(int i=1;i<str.length();i++){
			if((int)str.charAt(i-1)>(int)str.charAt(i)){
				flag=false;
				break;
			}else{
				flag=true;
			}
		}
		return flag;		
	}
}
