package ch_09.Constructor;

public class Hippo extends Animal {
	public Hippo() {
		System.out.println("Making a Hippo");
	}
	
	public Hippo(String name) {
		super(name);
	}
}
