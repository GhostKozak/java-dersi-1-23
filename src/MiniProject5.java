
public class MiniProject5 {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int findNumber = 3;
		boolean isThere = false;
		
		for (int num : numbers) {
			if (num == findNumber) {
				isThere = true;
				break;
			}
		}
		
		if (isThere) {
			System.out.println("Sayı mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}

}
