import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter the no of lines");
		Scanner scan = new Scanner(System.in);
		int noOfLines = scan.nextInt();// 5
		for (int i = 1; i <= noOfLines; i++) {
			for (int j = 1; j <= i; j++) {// i=1,j=1
				System.out.print((char) (64 + j)+" ");
			}
			System.out.println();
		}

	}

}
