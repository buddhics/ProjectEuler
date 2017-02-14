package q25;

import java.math.BigInteger;

public class FibLength {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(new FibLength().findFibIndex());
		long endTime = System.nanoTime();
		System.out.println((endTime-startTime)/1000000+"ms");
	}
	
	public double findFibIndex(){
		double index = 3;
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		while(f1.add(f2).toString().length() < 1000){
			BigInteger tmp = f1;
			f1 = f2;
			f2 = tmp.add(f2);
			index++;
		}
		return index;
	}
}
