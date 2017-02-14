package q14;

public class LongestChain {
	public static void main(String[] args) {
		int chainLength = 0,million = 1000000;
		
		int numberHolder = 0;
		
//		double number = 837799;
//		int tmpCount = 0;
//		
//		while(number>1){
//			if(number%2 == 0){
//				number = number/2;
//				tmpCount++;
//			}else{
//				number = 3*number+1;
//				tmpCount++;
//			}
//			System.out.println(number);
//		}
		
		
		
		
		for (int i = 2; i <= million; i++) {
			double number = i;
			int tmpCount = 0;
			while(number>1){
				if(number%2 == 0){
					number = number/2;
					tmpCount++;
				}else{
					number = 3*number+1;
					tmpCount++;
				}
			}
			
			if(chainLength < tmpCount){
				numberHolder = i;
				chainLength = tmpCount;
			}
			//System.out.println("++++++++++++++++++++++++"+i);
		}

		System.out.println("num : "+numberHolder);
		System.out.println("chain length : "+chainLength);
	}
}
