import java.io.*;
public class Common_subString {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			String str1=br.readLine();
			String str2=br.readLine();
			get_result(str1,str2);
		}	
	}

	public static void get_result(String str1,String str2){
		boolean flag=false;
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					flag=true;
					break;
				}
			}
		}
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
