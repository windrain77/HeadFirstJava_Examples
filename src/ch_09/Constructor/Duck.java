package ch_09.Constructor;

public class Duck extends Animal {

	int size;

	public Duck() {
		size = 27;
		System.out.println("Quack! size: " + size + " (default)");
	}

	public Duck(int duckSize) {
		super(); // super()를 명시적으로 호출하지 않으면, java 컴파일러에서 호출한다.
		this.size = duckSize;
		System.out.println("Quack! size: " + size);
	}

	public void setSize(int newSize) {
		size = newSize;
		System.out.println("size: " + size);
	}

}
