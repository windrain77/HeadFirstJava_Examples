package ch_08.Abstract;

public class Cat extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Cat's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Cat's eat()");
	}

	@Override
	void roam() {
		System.out.println("Cat's roam()");
	}

	@Override
	void sleep() {
		System.out.println("Cat's sleep()");
	}

}
