package day0603;

public class SmartTelevision implements RemoteControl, Searchable{
	String search;
	int volume;
	
	public void search(String search) {
		System.out.println(search + "를 검색합니다.");
	}
	public void turnOn() {
		System.out.println("SmartTv를 켭니다");
	}
	public void turnOff() {
		System.out.println("SmartTv를 끕니다");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
