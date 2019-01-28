package Geeks_For_Geeks;
public class PrintAllPalindrom{
	public static char[] pal;
	public static int[] charCounts = new int[256]; 
	public PrintAllPalindrom(String str) {
		pal = new char[str.length()];
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		printAllPalindromes("aabbcadad");
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	public static void printAllPalindromes(String str) {
		@SuppressWarnings("unused")
		PrintAllPalindrom printAllPalindromes = new PrintAllPalindrom(str);
		if(PrintAllPalindrom.isPalPossible(str)){
			PrintAllPalindrom.printPalUtil(0, str.length() - 1);
		}else{
			System.out.println("Palindrome not possible!!!");
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////
	public static void printPalUtil(int left, int right){
		if(left >= right){
			System.out.println(new String(pal));
		}else{
			for(int i = 0; i < charCounts.length; i++) {
				if(charCounts[i] > 0){
					pal[left] = pal[right] = (char)i;
					charCounts[i]-= 2;
					printPalUtil(left + 1, right - 1);
					charCounts[i] += 2;
				}
			}
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	public static boolean isPalPossible(String str){
		int len=str.length();
		for(int i=0;i<len;i++){
			charCounts[str.charAt(i)]++;	
		}
		int noOfOdds=0;
		for(int i=0;i<charCounts.length;i++){
			noOfOdds+=(charCounts[i] & 1);
			if((charCounts[i] & 1)==1){
				charCounts[i]--;
				pal[pal.length/2]=(char)i;
			}
		}
		if(noOfOdds > 1){
			return false;
		}
		return true;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////	
}