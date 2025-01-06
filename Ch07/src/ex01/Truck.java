package ex01;

public class Truck extends Car{
	public double speed;
	
	public Truck(double speed){
		super(0);
		this.speed = speed;
	}
	
	public void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
	
//	public double GetSpeed() {
//		return speed;
//	}
	
	public int GetSpeed() {
		return (int)speed;
	}
}
