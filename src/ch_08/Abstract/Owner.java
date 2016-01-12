package ch_08.Abstract;

public class Owner {
	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Hippo();
		a[3] = new Wolf();
		a[4] = new Lion();
	
		Vet vet = new Vet();
		MyAnimalList myList = new MyAnimalList();
		for (int i = 0; i < a.length; i++) {
			a[i].eat();
			a[i].roam();
			vet.giveShot(a[i]);
			myList.add(a[i]);
			
	//	 About Object class's method 
		// equals()
			if(a[i].equals(a[i]))
				System.out.println("true");
			else
				System.out.println("false");
		// getClass()
			System.out.println(a[i].getClass());
		// hashCode()
			System.out.println(a[i].hashCode());
		// toString()
			System.out.println(a[i].toString());
			System.out.println("----------------------------------");
		}
	
		Wolf w = new Wolf();
		System.out.println(w.getClass());
		System.out.println(w.getClass().getName());
		System.out.println(w.getClass().getSimpleName());
		System.out.println("----------------------------------");
		
		Object obj = new Wolf();
		System.out.println(obj instanceof Wolf);
		System.out.println(obj instanceof Dog);
		
	}// main
}
