import java.util.Scanner;
public class Best_Internet_Browser {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			get_result(str);
		}
	}
	public static void get_result(String str){
		int count=4;
		for(int i=4;i<str.length()-4;i++){
			char pp=str.charAt(i);
			if(pp=='a' || pp=='e' || pp=='i' || pp=='o' || pp=='u'){
				
			}else{
				count++;}
			}
		System.out.println(count+"/"+str.length());
	}
}
