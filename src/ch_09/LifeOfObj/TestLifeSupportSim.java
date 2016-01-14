package ch_09.LifeOfObj;

import java.util.*;

class V2Radiator {
	public V2Radiator() {
		System.out.println("* add V2Radiator");
	}
	
	V2Radiator(ArrayList list) {
		for (int i = 0; i < 5; i++) {
			SimUnit s = new SimUnit("V2Radiator");
			list.add(s);
			System.out.println(list.indexOf(s) + " - add V2Radiator");
		}
	}
}

class V3Radiator extends V2Radiator {
	V3Radiator(ArrayList list) {
	//	super(list); // It is good for nothing

		for (int i = 0; i < 10; i++) {
			SimUnit s = new SimUnit("V3Radiator");
			list.add(s);
			System.out.println(list.indexOf(s) + " = add V3Radiator");
		}
	}
}

class RetentionBot {
	RetentionBot(ArrayList list) {
		SimUnit s = new SimUnit("RetentionBot");
		list.add(s);
		System.out.println(list.indexOf(s) + " > add RetentionBot");
	}
}

class SimUnit{
	String botType;
	
	SimUnit(String type){
		botType = type;
	}
	
	int isPowerUse(){
		if("Retention".equals(botType)){
			return 2;
		}
		else{
			return 4;
		}
	}
}

public class TestLifeSupportSim {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		
		V2Radiator v2 = new V2Radiator(aList);
		System.out.println("--------------------------------------");
		
		V3Radiator v3 = new V3Radiator(aList);
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < 20; i++){
			RetentionBot ret = new RetentionBot(aList);
		}
		System.out.println("--------------------------------------");
		
		System.out.println("aList size: " + aList.size() );
	}

}
