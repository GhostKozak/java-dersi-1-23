
public class RecapDemo1 {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 25;
		int num3 = 26;
		int largestNum = num1;

		if (largestNum < num2) {
			largestNum = num2;
		}
		
		if (largestNum < num3) {
			largestNum = num3;
		}
		
		System.out.println("En büyük = " + largestNum);
	}

}
