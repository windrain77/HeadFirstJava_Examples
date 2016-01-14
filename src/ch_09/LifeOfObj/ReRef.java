package ch_09.LifeOfObj;

import ch_09.Constructor.Duck;

public class ReRef {

	Duck d = new Duck();
	
	public void go(){
		d = new Duck();
	}
	
}
