package ch_08.Abstract;

public class Dog extends Canine {

	@Override
	public void makeNoise() {
		System.out.println("Dog's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Dog's eat()");
	}

	@Override
	void roam() {
		System.out.println("Dog's roam()");
	}

	@Override
	void sleep() {
		System.out.println("Dog's sleep()");
	}
	
}
