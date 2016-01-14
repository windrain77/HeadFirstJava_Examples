package ch_10.Static;

public class Duck {

	private int size;

	// static 변수는 클래스가 처음 로딩될 때만 초기화된다.
	private static int duckCount = 0;
	
	private static int getDuckCount() {
		return duckCount;
	}

	public Duck() {
		duckCount++;
	}

	public void setSize(int s) {
		size = s;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		Duck[] d = new Duck[25];
		for (int i = 0; i < 25; i++) {
			d[i] = new Duck();
		}

		// static 변수는 모든 클래스 객체에 의해 공유된다.
		System.out.println("Duck Count: " + Duck.duckCount);
	}

}
