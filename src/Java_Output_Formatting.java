import java.io.*;
public class Java_Output_Formatting {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 	 
		 String str=br.readLine();
		 String str1=br.readLine();
		 String str2=br.readLine();
		
		 String[] A=str.split(" +");
		 String[] A1=str1.split(" +");
		 String[] A2=str2.split(" +");
		
		 System.out.println("================================");
		 
		 System.out.printf("%-15s %03d\n",A[0],Integer.parseInt(A[1]));	
		 System.out.printf("%-15s %03d\n",A1[0],Integer.parseInt(A1[1]));	
		 System.out.printf("%-15s %03d\n",A2[0],Integer.parseInt(A2[1]));	
	
		 System.out.println("================================");
	}
}
