import java.util.Scanner;
public class binary_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int i=n;
		int b=0;
		while(i>=1){
			a[b]=(int)i%2;
		//	System.out.println(a[b]);
			i=(int)i/2;
			//System.out.println(i);
			b++;
		}
	for(int j=b-1;j>=0;j--)
		{System.out.print(a[j]);}
	
	for(int j=b-1;j>=0;j--){
		if(a[j]==1){
			a[j]=0;
		}else{
			a[j]=1;
		}
	}
	int c=0;
	if(a[0]==0){
		a[0]=1;
	}else{
		a[0]=0;
		a[c++]=1;
		
	}
	System.out.print("\n");
	for(int j=b-1;j>=c;j--){
		{System.out.print(a[j]);}
		
		for(int k=c-1;k>=0;k--){System.out.print(a[k]);}
	}

	}

}
