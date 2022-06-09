package day0603;

//다중 상송 두 번째 방법
//클래스로 상속, 인터페이스로 구현 각각 하나씩 

interface Flyable2 {
	void fly();
}
class Car{
	int speed;
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class FlyingCar2 extends Car implements Flyable2{
	public void fly() {
		System.out.println("비행");
	}
	public static void main(String[] args) {
		
		FlyingCar2 fc2 = new FlyingCar2();
		fc2.fly();
		fc2.setSpeed(100);
		System.out.println(fc2.speed);
	}

}
