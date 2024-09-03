
public class IfElseDemo1 {

	public static void main(String[] args) {
		// Scanner
		int marks[][] = { { 12, 21, 33 }, { 90, 87, 67 }, { 23, 33, 78 } };

		for (int i = 0; i < marks.length; i++) {

			for (int j = 0; j < marks.length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}

		int empids[] = { 22, 33, 44, 55, 66, 6, 77, 88, 99, 100 };

		for (int id : empids) {
			System.out.println(id);
		}
	}
}
