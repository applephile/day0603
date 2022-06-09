package day0603;

interface OperateCar {
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	
	default void fly() {
		System.out.println("날다");
	};
}

class OldCar implements OperateCar {

	public void start() {
		
	}
	public void stop() {
		
	}
	public void setSpeed(int speed) {
		
	}
	public void turn(int degree) {
		
	}
	
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		
		OldCar oc = new OldCar();
		oc.fly();
	}

}
