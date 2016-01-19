package ch_10.Static;

class STest{
	private STest(){}
	
	public static int S_TEST_01 = 100;
}

public class TestMath {
	public static void main(String[] args) {
	//	Math mathObject = new Math();
		int x = Math.round(42.2f);
		int y = Math.min(56,  12);
		int z = Math.abs(-343);
		System.out.println(x + ", " + y + ", " + z);
		
		System.out.println("E : " + Math.E + "\nPI : " + Math.PI);
		
		System.out.println(STest.S_TEST_01);
	}
}
