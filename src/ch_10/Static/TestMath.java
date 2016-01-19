package ch_10.Static;

class STest{
	private STest(){}
	
	public static int S_TEST_01 = 100;
	public static final int SF_TEST_01 = 1000;
	public static final int SF_TEST_02;
	static{
		SF_TEST_02 = 2000;
	}
}

class Foo{
	public final void finalMethod(){
		// Override 되지 않는 중요한 메소드
	}
}

final class Var{
	// 이 클래스는 확장(extends, 상속)할 수 없다.
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
		System.out.println(STest.SF_TEST_01);
		System.out.println(STest.SF_TEST_02);
	}
}
