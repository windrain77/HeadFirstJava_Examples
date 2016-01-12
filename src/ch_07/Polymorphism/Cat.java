package ch_07.Polymorphism;

public class Cat extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Cat's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Cat's eat()");
	}

}
