package ch_08.Abstract;

public class MyAnimalList {
	
	private Animal[] animals = new Animal[5];
	private int nextIdx = 0;

	public void add(Animal a) {
		if(nextIdx < animals.length){
			animals[nextIdx] = a;
			System.out.println("Animal added at [" + nextIdx + "]");
			nextIdx++;
		}
	}
	
}
