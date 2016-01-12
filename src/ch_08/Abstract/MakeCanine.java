package ch_08.Abstract;

public class MakeCanine {
	public void go() {
		Canine c;
		c = new Dog();
	//	c = new Canine();
		c.roam();
	}
}
