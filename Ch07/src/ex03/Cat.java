package ex03;

public class Cat extends Animal{
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
	
	public void Heal() {
		if(IsHealthy())
			System.out.println("지금처럼 하세요.");
		else
			System.out.println("고기를 자주 주세요.");
	}
}
