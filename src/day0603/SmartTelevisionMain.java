package day0603;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.search("hi");
		st.setVolume(8);
		st.turnOff();
	}

}
