package day0603;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
	}

}






















