package ex03;

public class Main {

	public static void main(String[] args) {
		Thread thread = new WorkerThread();
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("TTing");
			try{
				Thread.sleep(500);
			}
			catch(Exception e){}
		}
	}

}
