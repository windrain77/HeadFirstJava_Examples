package ch_08.Interface;

public class Dog extends Canine {

	@Override
	public void makeNoise() {
		System.out.println("Dog's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Dog's eat()");
	}

}
