//Minimum Cost To Make Two Strings Identical
package Geeks_For_Geeks;
import java.util.*;
////////////////////////////////////////////////////////////////////////////////////////
public class Minimum_Cost_To_Make_Two_Strings_Identical {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String X=in.next();
		String Y=in.next();
		System.out.println(findMinCost(X,Y,10,20));
		in.close();
	}

////////////////////////////////////////////////////////////////////////////////////////
	public static int findMinCost(String X,String Y,int a,int b){
		int lx=X.length();
		int ly=Y.length();
		int lcs=lcs(X.toCharArray(),Y.toCharArray(),lx,ly);
		return a*(lx-lcs)+b*(ly-lcs);
	}
	
////////////////////////////////////////////////////////////////////////////////////
//recursive lcs	
	public static int lcs(char[] X,char[] Y,int m,int n){
		if(m==0 ||n==0){
			return 0;
		}
		if(X[m]==Y[n])
			return 1+lcs(X,Y,m-1,n-1);
		else
			return Integer.max(lcs(X,Y,m,n-1),lcs(X,Y,m-1,n));
	}
	
/////////////////////////////////////////////////////////////////////////////////////////
	/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
/*	public static int lcs(String X,String Y, int m, int n)
	{
		
	    int L[][]=new int[m+1][n+1];
	 
	    /* Following steps build L[m+1][n+1] in bottom
	       up fashion. Note that L[i][j] contains length
	       of LCS of X[0..i-1] and Y[0..j-1] */
	    /*char[] X1=X.toCharArray();
	    char[] Y1=Y.toCharArray();
	    
	    for (int i=0; i<=m; i++)
	    {
	        for (int j=0; j<=n; j++)
	        {
	            if (i == 0 || j == 0)
	                L[i][j] = 0;
	 
	            else if (X1[i-1] == Y1[j-1])
	                L[i][j] = L[i-1][j-1] + 1;
	 
	            else
	                L[i][j] = Integer.max(L[i-1][j], L[i][j-1]);
	        }
	    }
	 
	    /* L[m][n] contains length of LCS for X[0..n-1] and
	       Y[0..m-1] */
	    /*return L[m][n];
	}*/
}
/////////////////////////////////////////////////////////////////////////////////////////