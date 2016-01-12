package ch_08.Interface;

public class Cat extends Feline implements Pet {

	@Override
	public void makeNoise() {
		System.out.println("Cat's makeNoise()");
	}

	@Override
	public void eat() {
		System.out.println("Cat's eat()");
	}

	@Override
	public void beFriendly() {
		System.out.println("Cat's beFriendly()");
	}

	@Override
	public void play() {
		System.out.println("Cat's play()");
	}

}
