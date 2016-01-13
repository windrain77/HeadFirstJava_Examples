package ch_09.Constructor;

public class Duck {

	int size;
	
	public Duck() {
		size = 27;
		System.out.println("Quack! size: " + size + " (default)");
	}

	public Duck(int duckSize) {
		this.size = duckSize;
		System.out.println("Quack! size: " + size);
	}

	public void setSize(int newSize) {
		size = newSize;
		System.out.println("size: " + size);
	}

}
