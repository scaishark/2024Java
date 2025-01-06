package ex05;

public class User extends Thread{
	private Calculator calculator;
	private int memory;
	
	public User(String name) {
		setName(name);
	}
	
	public void setCalculator(Calculator calculator, int memory) {
		this.calculator = calculator;
		this.memory = memory;
	}
	
	public void run() {
		calculator.setMemory(memory);
	}
}
