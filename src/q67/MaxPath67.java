package q67;

import java.io.IOException;

import q18.MaxPath;

public class MaxPath67 {
	public static void main(String[] args) {
		try {
			new MaxPath().calculateMaxPath("resources/numbers_q67.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
