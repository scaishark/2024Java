package ex04;

public class Main {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Main thread : " + mainThread.getName());

		Thread threadA = new ThreadA();
		System.out.println("threadA : " + threadA.getName());
		
		Thread threadB = new Thread();
		System.out.println("threadB : " + threadB.getName());
	}

}
