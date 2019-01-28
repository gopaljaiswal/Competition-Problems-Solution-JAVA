
public class Multile_Substring_of_String {
	public static void main(String[] args){
		String str="abcd";
		int p=split(str);
		System.out.println(p);
	}
	
	public static int split(String src) {
	    int result=0;
	    for(int i=1;i<=src.length();i++){
	    	boolean flag=true;
	    	String str="";
	    	str=src.substring(0,i);
	    	int j=0;
	    	while((j+i)<=src.length()){
	    		String str1="";
	    		src.substring(j,j+i);
	    		if(str1.equalsIgnoreCase(str)==false){
	    			flag=false;
	    			break;
	    		}
	    		j=j+i;
	    	}
	    	if(flag=true){
	    		return str.length();
	    	}
	    }
		return result;
	}
}
