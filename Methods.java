public class Methods {
	private static void foo() {
		System.out.println("Begin foo");
		bar();
		System.out.println("Last sentence of method foo.");

	}

	private static void bar() {
		System.out.println("Begin bar");
		foobar();
		System.out.println("Last sentence of method bar.");

	}

	private static void foobar() {
		System.out.println("Begin foobar");
		System.out.println("Last sentence of method foobar.");
		
	}

	public static void main(String[] args) {
		System.out.println("Call for foo() in main method");
		foo();
		System.out.println("---");
		System.out.println("Call for bar() in main method.");
		bar();
	}
}