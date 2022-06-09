package day0603;

interface MyInterface{
	public void myMethod1();
	
	default void myMethod2() {
		System.out.println("myMethod2");
	};
}

public class DefaultMethod1 implements MyInterface{
	public void myMethod1() {
		System.out.println("myMethod1");
	}
	
	public static void main(String[] args) {
		
		DefaultMethod1 dm = new DefaultMethod1();
		dm.myMethod1();
		dm.myMethod2();
	}

}
