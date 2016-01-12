package ch_07.Polymorphism;

public class Hippo extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Hippe's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Hippo's eat()");
	}

}
