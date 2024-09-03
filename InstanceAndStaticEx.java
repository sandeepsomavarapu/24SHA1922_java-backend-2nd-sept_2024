
public class InstanceAndStaticEx {
	int empid = 456;// global and instance 4 bytes
	static int countryCode = 91;// global and static

	public static void main(String[] args) {
		int result = 234;// local variable

		System.out.println(InstanceAndStaticEx.countryCode);

		InstanceAndStaticEx obj = new InstanceAndStaticEx();
		System.out.println(obj.empid);
		String name="123";//

	}

}
