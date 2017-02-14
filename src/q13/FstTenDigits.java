package q13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FstTenDigits {
	public static void main(String[] args) {
		File file = new File("resources/numbers_q13.txt");
		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			int count[] = new int[50];
			Arrays.fill(count, 0);
			while((line = bf.readLine())!=null){
				char c[] = line.toCharArray();
				for (int i = 0; i < c.length; i++) {
					count[i] = count[i]+Character.getNumericValue(c[i]);
				}
			}
			int actualNum[]=new int[50];
			for (int i = 49; i >= 0; i--) {
				actualNum[i] = i>0?(count[i]%10):count[i];
				if(i>0)count[i-1] = count[i-1]+(count[i]-(count[i]%10))/10;
			}
			System.out.println(Arrays.toString(actualNum));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
