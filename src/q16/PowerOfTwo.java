package q16;

import java.math.BigInteger;

public class PowerOfTwo {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("2");
		BigInteger number = b.pow(1000);
		
		char c[] = number.toString().toCharArray();
		
		double count = 0;
		
		for (int i = 0; i < c.length; i++) {
			count = count+Character.getNumericValue(c[i]);
		}
		System.out.println(count);
	}
}
