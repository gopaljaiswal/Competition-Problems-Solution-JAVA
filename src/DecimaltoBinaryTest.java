
	public class DecimaltoBinaryTest {
	     public static void main(String[] args) {
	        DecimaltoBinary decimaltoBinary = new DecimaltoBinary();
	        System.out.println("hello " + decimaltoBinary.convertToBinary(1000000000,0));
	    }

	}
	class DecimaltoBinary {

	    public DecimaltoBinary() {
	    }

	    public long convertToBinary(long num,long binary) {
	        if (num == 0 || num == 1) {
	            return num;
	        } 
	        binary = convertToBinary(num / 2, binary);
	        binary = binary * 10 + (num % 2);
	        return binary;
	    }
	}
