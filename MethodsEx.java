import java.util.Date;

public class MethodsEx {
	public void printName(String name) {// instance
		System.out.println(name);
	}

	public static void printDate() {// static
		Date date = new Date();
		System.out.println("Today's Date :" + date);
	}

	public int sumOfTwo(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		MethodsEx obj = new MethodsEx();
		obj.printName("mahesh");

		MethodsEx.printDate();
		System.out.println(obj.sumOfTwo(12, 13));

	}

}
