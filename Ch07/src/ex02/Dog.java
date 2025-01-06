package ex02;

public class Dog {
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
}
