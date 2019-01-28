import java.util.*;
public class Gridland_Metro {
	class Student{
		int r1;
		int c11;
		int c22;
		String name;

		Student(int r,int c1,int c2) {
			r1=r;
			c11=c1;
			c22=c2;
    		}
		}
	
	public static void main(String[] args){
		Gridland_Metro pp=new Gridland_Metro();
		Scanner in=new Scanner(System.in);
		int R=in.nextInt();
		int C=in.nextInt();
	    TreeSet<Student> ts = new TreeSet<Student>();
	    int K=in.nextInt();
	    for(int i=0;i<K;i++){
	    	int r=in.nextInt();
	    	
			int c1=in.nextInt();
			int c2=in.nextInt();
        	ts.add(pp.new Student(r,c1,c2));
	    }	
	    
		System.out.println();
		in.close();
	}

}