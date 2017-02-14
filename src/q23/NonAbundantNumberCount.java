package q23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @link http://oeis.org/wiki/Abundant_numbers#All_integers_greater_than_20161_are_expressible_as_the_sum_of_two_abundant_numbers_in_at_least_one_way
 * @link http://oeis.org/A048242
 * @link http://oeis.org/A048242/b048242.txt
 */

public class NonAbundantNumberCount {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("resources/abundant_q23.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String line;
		int count =0 ;
		try {
			while((line = bf.readLine())!= null){
				count+=Integer.parseInt(line.split(" ")[1]);
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
