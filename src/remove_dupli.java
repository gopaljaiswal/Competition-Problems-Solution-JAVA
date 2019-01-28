/**
 * The class RemoveDupChar inputs a word and replaces the sequence of duplicate characters
 * by its single occurrence
 * @author : www.javaforschool.com
 * @Program Type : BlueJ Program - Java
 */
 
import java.io.*;
public class remove_dupli
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word: "); 
        String s = br.readLine();
 
        s = s + " "; 
        int l=s.length();
        String ans="";
        char ch1,ch2;
        int count=0;
 
        for(int i=0; i<l-1; i++)
        {
            ch1=s.charAt(i);
            ch2=s.charAt(i+1);
            if(ch1!=ch2)
            {                  
            ans = ans + ch1;
            count++;
            }
        }
        System.out.print(count);
        System.out.println("Word after removing repeated characters = "+ans); // Printing the result
    }
}