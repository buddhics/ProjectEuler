package q28;

public class AddDiagonals {
	public static void main(String[] args) {
		double count = 1;
		double actualStart = 1;
		for (int i = 1; i <= 999; i+=2) {
			double start = actualStart;
			for (int j = 0; j < 4; j++) {
				start = start+i+1;
				count = count+start;
				actualStart = start;
			}
		}
		System.out.println(count);
	}
}
