package ch_09.Constructor;

public class Duck {

	int size;

	public Duck(int duckSize) {
		System.out.println("Quack");
		this.size = duckSize;
		System.out.println("size: " + size);
	}

	public void setSize(int newSize) {
		size = newSize;
		System.out.println("size: " + size);
	}

}
