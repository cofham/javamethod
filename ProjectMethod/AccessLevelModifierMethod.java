class Greeting{
	//public, protected, default, private
	public static void hi() {
		System.out.println("Hi");
	}
}


public class AccessLevelModifierMethod {
	private static void hi() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Greeting.hi();
		hi();
	}

}
