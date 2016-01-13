package ch_09.Constructor;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public Animal() {
		System.out.println("Making an Animal");
	}
	
	public Animal(String theName) {
		name = theName;
		System.out.println("Create : " + name);
	}
}
