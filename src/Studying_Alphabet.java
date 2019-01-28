
////////////////////////////////////////////////////////////////////////////////////////
	import java.io.*;
	public class Studying_Alphabet {
			public static void main(String[] args) throws IOException{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String str=br.readLine();
				int N=Integer.parseInt(br.readLine());
				for(int i=0;i<N;i++){
					String str1=br.readLine();
					check(str,str1);
				}
				br.close();
			}
////////////////////////////////////////////////////////////////////////////////////////			
			public static void check(String str,String str1){
				int count=0;
				for(int i=0;i<str1.length();i++){
					char p=str1.charAt(i);
					for(int j=0;j<str.length();j++){
						if(p==str.charAt(j)){
							count++;
							break;
						}
					}
				}
				//System.out.println(count);
				if(count==str1.length()){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
	}
///////////////////////////////////////////////////////////////////////////////////////