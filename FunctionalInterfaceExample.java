
public class FunctionalInterfaceExample implements InterfaceExample{
 
public static void main(String[] args) {
	FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
			fie.myMethod();
			fie.myMethod1();
	}
		public void myMethod() {
			System.out.println("Hello");
	}
}

.....................................................................................................................................................................................................

@FunctionalInterface
public interface InterfaceExample {
	void myMethod();
	
	public default void myMethod1() {
		System.out.println("MY Name");
	}

}

