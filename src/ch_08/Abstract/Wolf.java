package ch_08.Abstract;

public class Wolf extends Canine {

	@Override
	public void makeNoise() {
		System.out.println("Wolf's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Wolf's eat()");
	}

	@Override
	void roam() {
		System.out.println("Wolf's roam()");
	}

	@Override
	void sleep() {
		System.out.println("Wolf's sleep()");
	}
	
}
