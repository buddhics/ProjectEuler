package q22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameValueCounter {
	public static void main(String[] args) throws FileNotFoundException {
		
		Map<Character, Integer> alphabetMap = new HashMap<Character, Integer>();
		alphabetMap.put('A', 1); alphabetMap.put('J', 10); alphabetMap.put('S', 19);
		alphabetMap.put('B', 2); alphabetMap.put('K', 11); alphabetMap.put('T', 20);
		alphabetMap.put('C', 3); alphabetMap.put('L', 12); alphabetMap.put('U', 21);
		alphabetMap.put('D', 4); alphabetMap.put('M', 13); alphabetMap.put('V', 22);
		alphabetMap.put('E', 5); alphabetMap.put('N', 14); alphabetMap.put('W', 23);
		alphabetMap.put('F', 6); alphabetMap.put('O', 15); alphabetMap.put('X', 24);
		alphabetMap.put('G', 7); alphabetMap.put('P', 16); alphabetMap.put('Y', 25);
		alphabetMap.put('H', 8); alphabetMap.put('Q', 17); alphabetMap.put('Z', 26);
		alphabetMap.put('I', 9); alphabetMap.put('R', 18);
		
		File nameList = new  File("resources/names_q22.txt");
		BufferedReader bf = new BufferedReader(new FileReader(nameList));
		try {
			String line = bf.readLine();
			String names[] = line.split(",");
			
			String reArranged[] = new String[names.length];
			for (int i = 0; i < reArranged.length; i++) {
				reArranged[i] = names[i].split("\"")[1];
			}
			
			Arrays.sort(reArranged);
			
			System.out.println(new NameValueCounter().finalCount(reArranged, alphabetMap));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double finalCount(String names[],Map<Character, Integer> alphabetMap){
		double finalCount = 0;
		for (int i = 0; i < names.length; i++) {
			char nameCharacters[] = names[i].toCharArray();
			double nameVal = 0;
			for (int j = 0; j < nameCharacters.length; j++) {
				nameVal = nameVal+alphabetMap.get(nameCharacters[j]);
			}
			finalCount = finalCount+(nameVal*(i+1));
		}
		
		return finalCount;
	}
}
