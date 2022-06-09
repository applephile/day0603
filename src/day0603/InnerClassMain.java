package day0603;

class OuterClass {
	
	private int value = 100;
	//내부 클래스를 선언하면 외부 클래스에 private 접근자로 선언한 변수도 내부 클래스 안에서 사용 가능하다
	
	class InnerClass {
		public void myMethod() {
			int num  = 1;
			System.out.println("Inner 클래스 value : " + value);
		}
	}
	
	OuterClass(){
		InnerClass inner =new InnerClass();
		inner.myMethod();
	}
}

public class InnerClassMain {
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		
	}
	
}
