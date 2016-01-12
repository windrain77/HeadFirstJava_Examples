package ch_07.Polymorphism;

public class Owner {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Hippo();
		a[3] = new Wolf();
		a[4] = new Lion();

		Vet vet = new Vet();
		for (int i = 0; i < a.length; i++) {
		//	a[i].eat();
		//	a[i].roam();
			vet.giveShot(a[i]);
			System.out.println("----------------------------------");
		}
				
	}// main
}
