package ch_07.Polymorphism;

public class Wolf extends Canine {

	@Override
	public void makeNoise() {
		System.out.println("Wolf's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Wolf's eat()");
	}

}
