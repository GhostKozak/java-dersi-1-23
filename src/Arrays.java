
public class Arrays {
	public static void main(String[] args) {
		String student1 = "Miraç";
		String student2 = "Gökhan";
		String student3 = "Ayşe";
		String student4 = "Nuray";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("-----------------------------");
		
		String[] students = new String[4];
		students[0] = "Miraç";
		students[1] = "Gökhan";
		students[2] = "Ayşe";
		students[3] = "Nuray";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("/-/-/-/-/-/-/");
		for (String student : students) {
			System.out.println(student);
		}
	}
}
