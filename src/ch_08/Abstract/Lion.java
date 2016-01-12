package ch_08.Abstract;

public class Lion extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Lion's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Lion's eat()");
	}

	@Override
	void roam() {
		System.out.println("Lion's roam()");
	}

	@Override
	void sleep() {
		System.out.println("Lion's sleep()");
	}

}
