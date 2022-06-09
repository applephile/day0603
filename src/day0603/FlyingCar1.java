package day0603;

//다중 상속 : 하나의 클래스가 여러 개의 부모 클래스를 가지는 것
//다중상속의 첫 번째 방법
//동시에 여러 개의 인터페이스 구현

interface Drivable1 {
	void drive();
}

interface Flyable1 {
	void fly();
}

public class FlyingCar1 implements Drivable1, Flyable1{
	
	public void drive() {
		System.out.println("운전");
	}
	public void fly() {
		System.out.println("비행");
	}
	
	public static void main(String[] args) {
		
		FlyingCar1 fc1 = new FlyingCar1();
		fc1.drive();
		fc1.fly();
		
	}
	
}
