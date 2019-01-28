import java.util.Scanner;
public class The_Time_in_Words {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int h=in.nextInt();
		int m=in.nextInt();   
        if((h>=1 && h<=12) && (m>=0 && m<=59))
        {
        String words[]={"", "one", "two", "three", "four", "five", "six","seven", "eight", "nine","ten",
        "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
        "Twenty","Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five",
        "twenty six","twenty seven","twenty eight", "twenty nine"};
         String plu, a;
         if(m == 1 || m == 59)
            plu = "minute";
         else
            plu = "minutes";
         
         if(h==12)
            a = words[1];
         else
            a = words[h+1];
            

         if(m==0)
            System.out.println(words[h]+" O' clock");
         else if(m==15)
            System.out.println("quarter past "+words[h]);
         else if(m==30)
            System.out.println("half past "+words[h]);
         else if(m==45)
            System.out.println("quarter to "+a);
         else if(m<30) 
            System.out.println(words[m]+" "+plu+" past "+words[h]);
         else 
            System.out.println(words[60-m]+" "+plu+" to "+a);
        } 
    }
}
