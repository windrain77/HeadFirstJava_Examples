package ch_07.Polymorphism;

public class Tiger extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Tiger's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Tiger's eat()");
	}

}
