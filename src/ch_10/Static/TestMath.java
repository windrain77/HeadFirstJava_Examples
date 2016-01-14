package ch_10.Static;

public class TestMath {
	public static void main(String[] args) {
	//	Math mathObject = new Math();
		int x = Math.round(42.2f);
		int y = Math.min(56,  12);
		int z = Math.abs(-343);
		System.out.println(x + ", " + y + ", " + z);
		
		System.out.println("E : " + Math.E + "\nPI : " + Math.PI);
	}
}
