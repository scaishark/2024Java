package ex03;

import ex03.AnimalHospital;
import ex03.Cat;
import ex03.Dog;

public class AnimalHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHospital hospital = new AnimalHospital();
		
		Animal ani = new Dog(100);		
		hospital.CheckPatient(ani);
		hospital.HealPatient(ani);
		
		Cat cat = new Cat(100);
		hospital.CheckPatient(cat);
		hospital.HealPatient(cat);
	}
	
	void CheckPatient(Animal ani) {
		if(ani.IsHealthy())
			System.out.println("건강합니다.");
		else 
			System.out.println("아픕니다.");
	}
	
	
	void HealPatient(Animal ani) {
		ani.Heal();
	}
}
