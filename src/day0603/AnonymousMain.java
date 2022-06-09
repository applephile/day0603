package day0603;

interface RemoteControl1 {
	void turnOn();
	void turnOff();
}

//class Power implements RemoteControl {
//	public void turnOn() {
//		System.out.println("Tv On");
//	}
//	public void turnOff() {
//		System.out.println("Tv Off");
//	}
//}
public class AnonymousMain {

	public static void main(String[] args) {
		
		RemoteControl1 rc = new RemoteControl1() {
			public void turnOn() {
				System.out.println("Tv On");
			}
			public void turnOff() {
				System.out.println("Tv Off");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}
