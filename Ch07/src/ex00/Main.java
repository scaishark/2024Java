package ex00;

import ex01.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck(80);
		
		System.out.println("Truck Speed : " + truck.speed);
		truck.ShowSpeed();
		System.out.println("Truck Speed : " + truck.GetSpeed());
		
		Car car = truck;
		
		System.out.println("Car Speed : " + car.speed);
		car.ShowSpeed();
		System.out.println("Car Speed : " + car.GetSpeed());
	}
}
