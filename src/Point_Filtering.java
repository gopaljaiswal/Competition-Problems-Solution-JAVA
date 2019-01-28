import java.util.*;
public class Point_Filtering {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		double[] id=new double[N];
		double[] X=new double[N];
		double[] Y=new double[N];
		double[] Z=new double[N];
		for(int i=0;i<N;i++){
			id[i]=in.nextDouble();
			X[i]=in.nextDouble();
			Y[i]=in.nextDouble();
			Z[i]=in.nextDouble();
		}
		double[] B=new double[M];
		while(in.hasNext()){
			char p=in.next().charAt(0);
			int index=in.nextInt();
			get_B(B,id,X,Y,Z);
		}
		
		//get_B(B,id,X,Y,Z);
		in.close();
	}

	public static void get_B(double[] B,double[] id,double[] X,double[] Y,double[] Z){
		double[] Z1=new double[Z.length];
		for(int i=0;i<Z.length;i++){
			Z1[i]=Z[i];
		}
		Arrays.sort(Z);
		// Map<Integer,Demo> map=new HashMap<Integer, Demo>();
		    //Demo d1= new Demo(1,"hi",new Date(),1,1);
		    //Demo d2= new Demo(2,"this",new Date(),2,1);
		    //Demo d3= new Demo(3,"is",new Date(),3,1);
		double a=10,b=20;
		System.out.println(a+"   "+b);
		swap(a,b);
		System.out.println(a+"   "+b);
		 int s=0;
		for(int i=0;i<Z.length;i++){
			double p=Z[i];
			for(int j=0;j<Z1.length;j++){
				if(p==Z1[j]){
					swap(id[i],id[j]);
					swap(X[i],X[j]);
					swap(Y[i],Y[j]);
					//break;
				}
			}
		}
		for(int i=0;i<Z.length;i++){
			System.out.println(id[i]+"  "+X[i]+" "+Y[i]+" "+Z[i]);
		}
		
	}
	public static void swap(double a,double b){
		double c=a;
		a=b;
		b=c;
	}
}
