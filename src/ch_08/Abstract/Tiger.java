package ch_08.Abstract;

public class Tiger extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Tiger's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Tiger's eat()");
	}

	@Override
	void roam() {
		System.out.println("Tiger's roam()");
	}

	@Override
	void sleep() {
		System.out.println("Tiger's sleep()");
	}
	
}
