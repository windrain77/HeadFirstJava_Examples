package ch_08.Interface;

public class Lion extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Lion's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Lion's eat()");
	}

}
