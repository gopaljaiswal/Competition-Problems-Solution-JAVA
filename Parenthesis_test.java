import java.util.Scanner;
import java.util.*;
public class Parenthesis_test {
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int p=0,q=0,r=0;
	Stack st=new Stack();  
	Stack st1=new Stack();
	Stack st2=new Stack();
	
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='('){
			st.push("(");
		}
		else if(str.charAt(i)==')'){
			if(!st.isEmpty())
			st.pop();
		}
		//////////////////////////////////////////////
		if(str.charAt(i)=='{'){
			st1.push("{");
		}
		else if(str.charAt(i)=='}'){
			if(!st1.isEmpty())
			st1.pop();
		}
		//////////////////////////////////////////////
		if(str.charAt(i)=='['){
			st2.push("[");
		}
		else if(str.charAt(i)==']'){
			if(!st2.isEmpty())
			st2.pop();
		}
		/////////////////////////////////////////////////
	}
	if(st.isEmpty() && st1.empty() && st2.empty()){
		System.out.println("correct");
	}else{
		System.out.println("incorrect");
	}
	}
}
