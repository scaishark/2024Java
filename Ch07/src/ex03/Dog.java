package ex03;

public class Dog extends Animal{
	static double normalRunSpeed = 50;
	
	double runSpeed;
	
	Dog(double runSpeed){
		this.runSpeed = runSpeed;
	}
	
	public boolean IsHealthy() {
		if(runSpeed > normalRunSpeed)
			return true;
		else
			return false;
	}
	
	public void Heal() {
		if(IsHealthy())
			System.out.println("지금처럼 하세요.");
		else
			System.out.println("운동을 자주 시키세요.");
	}
}
