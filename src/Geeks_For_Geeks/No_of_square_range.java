//An Efficient method to count squares between two no
package Geeks_For_Geeks;
public class No_of_square_range {
	public static void main(String[] args)
	    {
	        int a=9, b=25;
	        CountSquares obj=new CountSquares();
	        System.out.print("Count of squares is " +
	                         (int)obj.countSquares(a, b));
	    }
	}

	class CountSquares
	{
		double countSquares(int a,int b)
			{
				return (Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a)) + 1);
    }
}