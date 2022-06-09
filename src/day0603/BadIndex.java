package day0603;

public class BadIndex {
	
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = 0;
		}
		try {
			int result = array[12];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 오류");
		}
		System.out.println("출력 여부");
	}
	
}
