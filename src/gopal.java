import java.util.Scanner;
public class gopal{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=0,m=0;
		//System.out.println("enter size of an array");
		int n=in.nextInt();
		int a[]=new int[n];
		//System.out.println("enter value of k");
		int k=in.nextInt();
		//System.out.println("enter elements in array");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			}
		if(n==k){
			for(int i=0;i<n;i++){
				t+=a[i];
			}
			System.out.println(t);
		}
		else{
		int a2[]=new int[k];
		try{
		System.arraycopy(a,0,a2,0,k);}catch(Exception e)
		{
			System.out.println( "Excetion in a2");
		}
		try{
		for(int i=k;i<n;i++){
			t+=a[i];
		}}
		catch(Exception e)
		{
			System.out.println( "Excetion in a1");
		}
		
		
		for(int i=0,j=k-1;i<k && j>=0;i++,j--){
				m+=(i+1)*a2[j];
		}
		
		
		
		
		/*for(int i=0;i<k;i++){
			System.out.println("elements in array a2"+a2[i]);
		}*/
		System.out.println(t+m);}
}}
