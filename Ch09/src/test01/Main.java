package test01;

public class Main {

	public static void main(String[] args) {
		new Person() {
			void wake() {
				System.out.println("Wake up at 6.");
			}
		}.wake();
	}
}
