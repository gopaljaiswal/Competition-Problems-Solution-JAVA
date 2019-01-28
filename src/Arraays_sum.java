public class Arraays_sum {
		public static void main(String[] args){
			int[] a={1,2,3,3};
			int i=1;
			while(i<a.length-1){
			int sum=0,sum1=0;
			for(int j=0;j<i;j++){
				sum+=a[j];
			}
			for(int k=i+1;k<a.length;k++){
				sum1+=a[k];
			}
			System.out.println(sum+" "+sum1);
			i++;}
		}
}
