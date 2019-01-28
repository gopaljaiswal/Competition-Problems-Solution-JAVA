import java.util.Arrays;
import java.util.Scanner;
public class Gem_stone {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			int count=0;
			String[] str=new String[N];
			for(int i=0;i<N;i++){
				str[i]=in.next();
			}
			char[] ch=new char[str[0].length()];
			char[] ch1=new char[str[0].length()];
			for(int i=0;i<str[0].length();i++){
				char aa=str[0].charAt(i);
				for(int j=0;j<str[1].length();j++){
					if(aa==str[1].charAt(j)){
						ch[i]=aa;
					}
				}
			}
			for(int i=2;i<N;i++){
				for(int j=0;j<ch.length;j++){
					char  aa=ch[j];
					for(int k=0;k<str[i].length();k++){
						if(aa==str[i].charAt(k)){
							ch1[j]=aa;
						}
					}
				}
			}
			for(int i=0;i<ch1.length;i++)
				if(ch1[i]!='\0'){
					System.out.print(ch1[i]);
					count++;
				}
			System.out.println(count);
		} 

}




/*for(int i=1;i<N;i++){
	for(int j=0;j<str[i-1].length();j++){
		int a=str[i-1].codePointAt(j);
		for(int k=0;k<str[i].length();k++){
			if(a==str[i].charAt(k)){
				count[i-1]=count[i-1]+1;
			}
		}
	}
}*/