package ex02;

public class Cat {
	static double normalJumpHeight = 100;
	double jumpHeight;
	
	Cat(double jumpHeight){
		this.jumpHeight = jumpHeight;
	}
	
	public boolean IsHealthy() {
		if(jumpHeight > normalJumpHeight)
			return true;
		else
			return false;
					
	}
}
