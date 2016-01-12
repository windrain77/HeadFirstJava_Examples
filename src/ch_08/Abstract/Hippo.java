package ch_08.Abstract;

public class Hippo extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Hippe's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Hippo's eat()");
	}

	@Override
	void roam() {
		System.out.println("Hippo's roam()");
	}

	@Override
	void sleep() {
		System.out.println("Hippo's sleep()");
	}
	
}
