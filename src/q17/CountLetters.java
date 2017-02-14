package q17;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
	public static void main(String[] args) {
		Map<Integer, Integer> letterCountMap = new HashMap<Integer,Integer>();
		letterCountMap.put(0, 0);
		letterCountMap.put(1, 3);
		letterCountMap.put(2, 3);
		letterCountMap.put(3, 5);
		letterCountMap.put(4, 4);
		letterCountMap.put(5, 4);
		letterCountMap.put(6, 3);
		letterCountMap.put(7, 5);
		letterCountMap.put(8, 5);
		letterCountMap.put(9, 4);
		letterCountMap.put(10, 3);
		
		letterCountMap.put(11, 6);
		letterCountMap.put(12, 6);
		letterCountMap.put(13, 8);
		letterCountMap.put(14, 8);
		letterCountMap.put(15, 7);
		letterCountMap.put(16, 7);
		letterCountMap.put(17, 9);
		letterCountMap.put(18, 8);
		letterCountMap.put(19, 8);
		
		letterCountMap.put(20, 6);
		letterCountMap.put(30, 6);
		letterCountMap.put(40, 5);
		letterCountMap.put(50, 5);
		letterCountMap.put(60, 5);
		letterCountMap.put(70, 7);
		letterCountMap.put(80, 6);
		letterCountMap.put(90, 6);
		
		int count = 0;
		
		Map<Integer, Integer> oneToNintyNine = new HashMap<Integer,Integer>();
		
		for (int i = 1; i <= 99; i++) {
			if(i<=10){
				oneToNintyNine.put(i, letterCountMap.get(i));
				count = count+letterCountMap.get(i);
			}else if(i>10 && i<20){
				oneToNintyNine.put(i, letterCountMap.get(i));
				count = count+letterCountMap.get(i);
			}else if(i>=20 && i<=99){
				oneToNintyNine.put(i, letterCountMap.get(i-(i%10))+letterCountMap.get(i%10));
				count = count+letterCountMap.get(i-(i%10))+letterCountMap.get(i%10);
			}
		}
		
		int hundred = 7;
		int hundredAnd = 10;
		
		for (int i = 100; i < 1000; i++) {
			if(i % 100 == 0){
				count = count+oneToNintyNine.get(i/100)+hundred;
			}else{
				count = count+oneToNintyNine.get((i-(i%100))/100)+hundredAnd+oneToNintyNine.get(i%100); 
			}
		}
		
		System.out.println(count+11);
		
	}
}
