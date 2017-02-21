package q29;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class DistinctTerms {
	public static void main(String[] args) {
		Set<BigInteger> s = new HashSet<BigInteger>();
		BigInteger a = new BigInteger("0");
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				a = new BigInteger(i+"");
				s.add(a.pow(j));
			}
		}
		System.out.println(s.size());
	}
}
