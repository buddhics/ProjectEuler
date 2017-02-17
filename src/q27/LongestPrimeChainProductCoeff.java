package q27;

public class LongestPrimeChainProductCoeff {
	public static void main(String[] args) {
		int maxLength = 0, maxA = 0, maxB = 0;
		for (int i = -1000; i < 1000; i++) {
			for (int j = -1000; j < 1000; j++) {
				int n = 0, tmpLength = 0;
				while(isPrime((n*n)+(i*n)+j)){
					n++;
					tmpLength++;
				}
				if(maxLength<tmpLength){
					maxA = i; maxB = j;
					maxLength = tmpLength;
				}
			}
		}
		System.out.println(maxA);
		System.out.println(maxB);
		System.out.println(maxA*maxB);
		System.out.println(maxLength);
	}
	
	private static boolean isPrime(int number){
		number = Math.abs(number);
		boolean b = true;
		for (int i = 2; i < number; i++) {
			if(number%i==0){
				b = false;
				break;
			}
		}
		return b;
	}
}
