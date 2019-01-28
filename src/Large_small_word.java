import java.util.Scanner;
import java.io.*;
public class Large_small_word {
	public static void main(String[] args) throws IOException{
		//Scanner in=new Scanner(System.in);
		String str;
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(ir);
		//System.out.println(str);
		str=in.readLine();
		String[] wordsArray=str.split(" ");
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		int maxsize=0;
		String maxWord="";
		for(int i=0;i<wordsArray.length;i++)
		{
		if(wordsArray[i].length()>maxsize)
		{
		maxWord=wordsArray[i];
		maxsize=wordsArray[i].length();
		}
		}
		System.out.println("Max sized word is"+maxWord+" with  size"+maxsize);
	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int min=wordsArray[0].length();
		String min_word=wordsArray[0];
		for(int i=0;i<wordsArray.length;i++){
			if(wordsArray[i].length()<min){
				min_word=wordsArray[i];
				min=wordsArray[i].length();
			}
		}
		System.out.println("Min sized word is"+min_word+" with  size"+min); 
	}
}
