import java.util.Scanner;
import java.io.*;
public class Consecutive_vowel {
		public static void main(String[] args) throws IOException{
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader in=new BufferedReader(ir);
			String str=in.readLine();
			String[] arr=str.split(" ");
			for(int i=0;i<arr.length;i++){
				String t=arr[i];
				for(int j=1;j<t.length();j++){
					if(t.charAt(j-1)=='a' || t.charAt(j-1)=='e'|| t.charAt(j-1)=='i' || t.charAt(j-1)=='o' || t.charAt(j-1)=='u'){
						if(t.charAt(j)=='a' || t.charAt(j)=='e'|| t.charAt(j)=='i' ||t.charAt(j)=='o'|| t.charAt(j)=='u'){
							System.out.println(t);
						}
					}
				}
			}
			
			
		}
}
