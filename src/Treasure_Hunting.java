import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.*;
public class Treasure_Hunting {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int a1=-b;
		int b1=a;
		double k=(x*b1-y*a1)/(a*b1-a1*b);
	
		BigDecimal db = new BigDecimal(k, MathContext.DECIMAL32);
		double n=(x*b-y*a)/(a1*b-a*b1);
		System.out.println(db);
		System.out.printf("%.2f",n);
		in.close();
	}
}