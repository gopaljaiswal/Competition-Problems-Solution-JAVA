import java.util.*;
public class Infinite_Power {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			int num=in.nextInt();
			get(num);
		}
		in.close();
	}
	
	public static void get(int num){
		boolean flag=true;
		int i=num;
		while(i>0){
			int p=i%10;
			if(p%2!=0){
				flag=false;
			}
			i=i/10;
		}
		if(flag==true){
			System.out.println("Undefined");
		}else if(flag==false){
			int max=maximum(num);
			int min=minimum(num);
			int p=max-num;
			int q=num-min;
			//System.out.println(max+" /  "+min);
			int p1=get_gcd(p,q);
			p /= p1;
			q /= p1;
			System.out.println(p+"/"+q);
		}
	}
	
	public static int get_gcd(int num1,int num2){
		if(num2==0){
		return num1;
	}
	return get_gcd(num2,num1%num2);
	}
	
	public static int minimum(int num){
		int i=num-1;
		int max=0;
		while(i>=0){
			if(done(i)==true){
				max=i;
				break;
			}
			i--;
		}
		return max;
	} 
	
	
	public static int maximum(int num){
		int i=num+1;
		int max=0;
		while(i<Integer.MAX_VALUE){
			if(done(i)==true){
				max=i;
				break;
			}
			i++;
		}
		return max;
	} 
	
	public static boolean done(int num){
		boolean flag=true;
		int i=num;
		while(i>0){
			int p=i%10;
			if(p%2!=0){
				flag=false;
			}
			i=i/10;
		}
		return flag;
	}
}